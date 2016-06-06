package edu.ynu.docmanagesystem.service.impl;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import java.io.OutputStream;
import java.net.ConnectException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.artofsolving.jodconverter.DefaultDocumentFormatRegistry;
import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.DocumentFormat;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;
import edu.ynu.docmanagesystem.mapper.ResourceMapper;
import edu.ynu.docmanagesystem.po.ResourceWithBLOBs;
import edu.ynu.docmanagesystem.service.DocService;

@Service
public class DocServiceImpl implements DocService {

	@Autowired
	private ResourceMapper resourceMapper;

	private final static String exePath = "I:/swftools/pdf2swf.exe";

	@Override
	public Integer storeFileToDB(Integer userId, byte[] bytes, String originalFilename, Integer resourceTypeId,
	        String resourceDescribe, double size) {
		ResourceWithBLOBs resource = new ResourceWithBLOBs();
		resource.setUserid(userId);
		resource.setContain(bytes);
		resource.setOriginalfilename(originalFilename);
		resource.setResourcetypeid(resourceTypeId);
		resource.setDescribe(resourceDescribe);
		resource.setSize(size);
		return resourceMapper.insertSelective(resource);
	}

	@Override
	public void transferDocToPdf(InputStream inputStream, String extendName, OutputStream outputStream) {
		OpenOfficeConnection connection = new SocketOpenOfficeConnection(8100);
		DefaultDocumentFormatRegistry defaultDocumentFormatRegistry = new DefaultDocumentFormatRegistry();
		DocumentFormat inputFormat = defaultDocumentFormatRegistry.getFormatByFileExtension(extendName);
		DocumentFormat outputFormat = defaultDocumentFormatRegistry.getFormatByFileExtension("pdf");
		try {
			connection.connect();
			DocumentConverter converter = new OpenOfficeDocumentConverter(connection);
			converter.convert(inputStream, inputFormat, outputStream, outputFormat);
		} catch (ConnectException cex) {
			cex.printStackTrace();
		} finally {
			// close the connection
			if (connection != null) {
				connection.disconnect();
				connection = null;
			}
		}

	}

	@Override
	public InputStream transferPdfToSwf(String pdfPath) throws Exception {
		// 文件路径
		String filePath = pdfPath.substring(0, pdfPath.lastIndexOf("/"));
		// 文件名，不带后缀
		String fileName = pdfPath.substring((filePath.length() + 1), pdfPath.lastIndexOf("."));
		Process pro = null;
		if (isWindowsSystem()) {
			// 如果是windows系统
			// 命令行命令
			String cmd = exePath + " \"" + pdfPath + "\" -o \"" + filePath + "/" + fileName + ".swf\"";
			// Runtime执行后返回创建的进程对象
			pro = Runtime.getRuntime().exec(cmd);
		} else {
			// 如果是linux系统,路径不能有空格，而且一定不能用双引号，否则无法创建进程
			String[] cmd = new String[3];
			cmd[0] = exePath;
			cmd[1] = pdfPath;
			cmd[2] = filePath + "/" + fileName + ".swf";
			// Runtime执行后返回创建的进程对象
			pro = Runtime.getRuntime().exec(cmd);
		}
		pro.waitFor();
		// pro.destroy();
		BufferedInputStream bufferedInputStream = new BufferedInputStream(
		        new FileInputStream(filePath + fileName + ".swf"));
		return bufferedInputStream;
	}

	@Override
	public Integer insertSwfToDb(byte[] swf, Integer resourceId) {
		ResourceWithBLOBs resourceWithBLOBs = new ResourceWithBLOBs();
		resourceWithBLOBs.setSwf(swf);
		resourceWithBLOBs.setResourceid(resourceId);
		return resourceMapper.updateByPrimaryKeySelective(resourceWithBLOBs);

	}

	private static boolean isWindowsSystem() {
		String p = System.getProperty("os.name");
		return p.toLowerCase().indexOf("windows") >= 0 ? true : false;
	}

}
