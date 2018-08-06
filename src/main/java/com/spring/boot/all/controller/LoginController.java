package com.spring.boot.all.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.spring.boot.all.bean.AnsQue;
import com.spring.boot.all.bean.User;
import com.spring.boot.all.service.LoginService;

@RestController
public class LoginController {

	@Autowired
	public LoginService service;

	@PostMapping(value = "/loginProcess", produces = "application/json")
	public ModelAndView findAll(@RequestBody AnsQue aqe) {

		List<User> viewList = service.finduser(aqe);

		ModelAndView andView = new ModelAndView();

		andView.addObject("login", andView);

		if (null != viewList) {
			andView.setViewName("sucess");
			andView.addObject("login", andView);

			return andView;
		} else {
			andView.setViewName("fail");
		}

		return andView;
	}

	@RequestMapping(value = "/app/validate", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public void insertmethod(@RequestBody AnsQue bean) {

		service.insertdata(bean);

		System.out.println("Inserted:::");

	}

}
