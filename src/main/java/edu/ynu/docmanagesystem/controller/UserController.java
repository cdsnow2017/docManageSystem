package edu.ynu.docmanagesystem.controller;

import java.util.HashMap;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUserid() + "", user.getPassword());
		//登录成功返回1
		State state = BeanFactory.getState("1");
		try {
			subject.login(token);
		} catch (UnknownAccountException e) {
			//用户名不存在
			state.setState("-1");

		} catch (IncorrectCredentialsException e) {
			//密码错误
			state.setState("0");
		} catch (Exception e) {
			//其他错误
			state.setState("-2");
		}
		return state;
	}

	@RequestMapping("/menu")
	public @ResponseBody Map<Object, Object> selectMenu() {
		Subject subject = SecurityUtils.getSubject();
		Integer userId = (Integer) subject.getPrincipal();
		HashMap<Object, Object> hashMap = new HashMap<>();
		hashMap.put("data", userService.findMenuById(userId));
		return hashMap;

	}

}
