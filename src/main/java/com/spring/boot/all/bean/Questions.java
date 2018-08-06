package com.spring.boot.all.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "questions")
public class Questions {

	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "questions")
	private String questions;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "qid")
	private User qid;

	public int getId() {
		return id;
	}

	public User getQid() {
		return qid;
	}

	public String getQuestions() {
		return questions;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setQid(User qid) {
		this.qid = qid;
	}

	public void setQuestions(String questions) {
		this.questions = questions;
	}

	@Override
	public String toString() {
		return "Questions [id=" + id + ", questions=" + questions + ", qid=" + qid + "]";
	}

}