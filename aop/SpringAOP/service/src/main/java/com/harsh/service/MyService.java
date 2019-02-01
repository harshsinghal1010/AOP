package com.harsh.service;

import org.springframework.stereotype.Service;

import data.User;

@Service
public class MyService {

	int a =9;
	public int showService(int id) {
		System.out.println("Service--> " + id + " A = "+ a);
		return 10001;
	}
}
