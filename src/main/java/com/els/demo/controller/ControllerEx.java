package com.example.els.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.els.service.ServiceEx;
import com.example.els.service.ServiceEx1;

@RestController
public class ControllerEx {
	
	@Autowired //Autowired by name
	ServiceEx1 service1;
	
	@Autowired //Autowired by qualifier
	@Qualifier("service2")
	ServiceEx service2;
	
	@GetMapping("/test")
	public void getUser() {
		service1.getUser();
		service2.getUser();
		System.out.println("Success");
	}
}