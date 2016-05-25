package edu.ynu.docmanagesystem.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

@RequestMapping(value = "/test")
public class TestController {

	// 将得到的值加1
	@RequestMapping("/testNumber")
	public  @ResponseBody  String testNumber() throws Exception {
		return "{" + "\"data\" :\"hello jetty\"" + "}";

	}

}
