package com.spring.boot.all.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.all.bean.AnsQue;
import com.spring.boot.all.bean.Answers;
import com.spring.boot.all.bean.Questions;
import com.spring.boot.all.bean.User;
import com.spring.boot.all.repository.Repositoryclass;

@Service
public class LoginService {

	@Autowired
	public Repositoryclass repository;

	public List<User> finduser(AnsQue aqe) {

		List<User> findall = repository.findByUsernameAndPassword(aqe.getUsername(), aqe.getPasswod());
		if (findall.isEmpty()) {

			System.out.println("No user Found::::");
		} else {
			System.out.println("User Found:::");

		}
		return findall;
	}

	public void insertdata(AnsQue ansque) {
		User u = new User();

		u.setId(ansque.getId());
		u.setUsername(ansque.getUsername());
		u.setPassword(ansque.getPasswod());

		Questions q = new Questions();
		q.setId(ansque.getId());
		q.setQuestions(ansque.getQuestions());

		q.setQid(u);

		Answers ans = new Answers();
		ans.setAid(ansque.getId());
		ans.setAnswers(ansque.getAnswers());

		ans.setQid(u);

		Set<Answers> anss = new HashSet<>();

		anss.add(ans);

		u.setAns(anss);

		Set<Questions> que = new HashSet<>();

		que.add(q);

		u.setQue(que);

		repository.save(u);

		System.out.println("Inserted:::");
	}

}
