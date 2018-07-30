package com.spring.boot.all.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.spring.boot.all.bean.LoginBean;
import com.spring.boot.all.bean.User;

@Service
public class LoginService {

	@Autowired
	public JdbcTemplate jdbcTemplate;

	public User validateUser(LoginBean login) {
		String sql = "select * from login where username='" + login.getUsername() + "' and password='"
				+ login.getPassword() + "'";
		List<User> beans = jdbcTemplate.query(sql, new Loginmapper());
		return beans.size() > 0 ? beans.get(0) : null;

	}

}
