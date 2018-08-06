package com.spring.boot.all.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.boot.all.bean.User;

@Repository
public interface Repositoryclass extends JpaRepository<User, String> {

	
	//JPA Query DSL(or) JPQL....
    @Query("SELECT t FROM User t where t.username = ?1 AND t.password = ?2")
	List<User> findByUsernameAndPassword(String username, String password);

}
