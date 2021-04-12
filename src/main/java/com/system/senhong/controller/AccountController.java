package com.system.senhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.senhong.model.Account;
import com.system.senhong.service.AccountService;



@RestController()
//@RequestMapping("/api/user")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping("/getAllUsers")
	public List<Account> list() {
		return accountService.getAll();
	}
	
	@GetMapping()
	public String sayHello() {
		return "Hello Spring Boot";
	}
	
}
