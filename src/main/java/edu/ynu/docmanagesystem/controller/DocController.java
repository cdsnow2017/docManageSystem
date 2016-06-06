package edu.ynu.docmanagesystem.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FilenameUtils;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import edu.ynu.docmanagesystem.service.DocService;
import edu.ynu.docmanagesystem.util.DocTransferConcurrent;

@Controller
@RequestMapping(value = "/doc")
public class DocController {
	@Autowired
	private DocService docService;

	@RequestMapping("/upload")
	public Map<Object, Object> upLoad(HttpSession session, HttpServletRequest request, MultipartFile file)
	        throws Exception {
		Subject subject = SecurityUtils.getSubject();
		Integer userId = (Integer) subject.getPrincipal();
		String resourceDescribe = request.getParameter("resourceDescribe");
		String resourceTypeId = request.getParameter("resourceTypeId");
		String originalFilename = file.getOriginalFilename();
		// 将上传的文件存储到数据库中
		Integer resouceId = docService.storeFileToDB(userId, file.getBytes(), originalFilename,
		        Integer.valueOf(resourceTypeId), resourceDescribe, file.getSize() / 1024.0);
		// 开启多线程后台转swf
		Thread docTransferConcurrent = new DocTransferConcurrent(file.getInputStream(),
		        FilenameUtils.getExtension(originalFilename), docService, resouceId);
		docTransferConcurrent.start();
		Map<Object, Object> map = new HashMap<>();
		// 返回资源id
		map.put("state", resouceId);
		return map;
	}

}
