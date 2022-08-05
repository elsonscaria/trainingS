package com.els.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.els.demo.repository.RepositoryEx;

@Service("service1")
public class ServiceEx1 implements ServiceEx{
	
	@Autowired //Autowire by Type
	RepositoryEx repo;
	
	public void getUser() {
		System.out.println("ServiceEx1");
		repo.getUser();
	}
}