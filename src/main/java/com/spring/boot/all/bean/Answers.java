package com.spring.boot.all.bean;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "answers")
public class Answers {

	@Id
	@Column(name = "aid")
	private int aid;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "qid")
	private User qid;

	@Column(name = "answers")
	private String answers;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public User getQid() {
		return qid;
	}

	public void setQid(User qid) {
		this.qid = qid;
	}

	@Override
	public String toString() {
		return "Answers [aid=" + aid + ", qid=" + qid + ", answers=" + answers + "]";
	}

	public String getAnswers() {
		return answers;
	}

	public void setAnswers(String answers) {
		this.answers = answers;
	}

}
