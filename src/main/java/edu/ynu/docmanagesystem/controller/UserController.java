package edu.ynu.docmanagesystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import edu.ynu.docmanagesystem.po.User;
import edu.ynu.docmanagesystem.poExtend.State;
import edu.ynu.docmanagesystem.poExtend.UserExtend;
import edu.ynu.docmanagesystem.service.UserService;
import edu.ynu.docmanagesystem.util.BeanFactory;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/login")
	public @ResponseBody State login(@RequestBody UserExtend user) throws Exception {
		return BeanFactory.getState(userService.loginVerify(user.getUserid(), user.getPassword(), user.getRoleid()) + "");

	}

}
