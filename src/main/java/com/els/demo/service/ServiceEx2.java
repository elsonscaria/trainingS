package com.els.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.els.demo.repository.RepositoryEx;

@Service("service2")
public class ServiceEx2 implements ServiceEx {
	
	@Autowired //Depedency Injection based on Field
	RepositoryEx repo1;
	RepositoryEx repo2;
	RepositoryEx repo3;
	
	//Dependency Injection based on Constructor
	ServiceEx2 (RepositoryEx repo){
		this.repo2 = repo;
	}
	
	//Dependency Injection based on Setter
	public void setRepositoryEx (RepositoryEx repo) {
		this.repo3 = repo;
	}
	
	public void getUser() {
		System.out.println("ServiceEx2");
		repo1.getUser();
		repo2.getUser();
		repo3.getUser();
	}
}