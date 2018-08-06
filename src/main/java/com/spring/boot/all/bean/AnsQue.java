package com.spring.boot.all.bean;

public class AnsQue {

	private int id;

	private String username;

	private String passwod;

	private String questions;

	private String answers;

	public String getAnswers() {
		return answers;
	}

	public int getId() {
		return id;
	}

	public String getPasswod() {
		return passwod;
	}

	public String getQuestions() {
		return questions;
	}

	public String getUsername() {
		return username;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPasswod(String passwod) {
		this.passwod = passwod;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public String toString() {
		return "AnsQue [id=" + id + ", username=" + username + ", passwod=" + passwod + ", questions=" + questions
				+ ", answers=" + answers + "]";
	}

}
