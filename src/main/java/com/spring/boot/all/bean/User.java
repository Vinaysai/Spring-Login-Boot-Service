package com.spring.boot.all.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class User {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "questions", cascade = CascadeType.ALL)
	private Set<Questions> que;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "answers", cascade = CascadeType.ALL)
	private Set<Answers> ans;

	public Set<Answers> getAns() {
		return ans;
	}

	public int getId() {
		return id;
	}

	public String getPassword() {
		return password;
	}

	public Set<Questions> getQue() {
		return que;
	}

	public String getUsername() {
		return username;
	}

	public void setAns(Set<Answers> ans) {
		this.ans = ans;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setQue(Set<Questions> que) {
		this.que = que;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", que=" + que + ", ans=" + ans
				+ "]";
	}
}
