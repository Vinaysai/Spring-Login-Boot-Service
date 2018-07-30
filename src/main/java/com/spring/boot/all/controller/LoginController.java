package com.spring.boot.all.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.boot.all.bean.LoginBean;
import com.spring.boot.all.bean.User;
import com.spring.boot.all.service.LoginService;

@Controller
public class LoginController {

	@Autowired
	public LoginService service;

	@RequestMapping(value = "/loginProcess", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public User loginProcess(@RequestBody LoginBean login) {
		User user = service.validateUser(login);
		if (null != user) {
			System.out.println("success");
		} else {
			System.out.println("fail");
		}
		return user;
	}
}
