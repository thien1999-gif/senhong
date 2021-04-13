package com.system.senhong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.system.senhong.exception.BadRequestException;
import com.system.senhong.exception.ResourceNotFoundException;
import com.system.senhong.model.Account;
import com.system.senhong.service.AccountService;

@RestController()
@RequestMapping("/api/user")
public class AccountController {

	@Autowired
	private AccountService accountService;

	@GetMapping("/get-all-users")
	public List<Account> list() {
		return accountService.getAll();
	}

	@PostMapping("/login")
	@ResponseBody
	public Account login(@RequestParam("email") String email, @RequestParam("password") String password)
			throws BadRequestException {
		Account accountExit = accountService.loginByEmailAndPassword(email, password);
		if (accountExit == null) {
			throw new BadRequestException("Invalid username or password");
		}
		return accountExit;
	}

	@PostMapping("/registration")
	public void registration(@Validated @RequestBody Account account) throws BadRequestException {
		
		Account accountEmailExit = accountService.findByEmail(account.getEmail());
		if(accountEmailExit != null) {
			throw new BadRequestException(account.getEmail() + " already registered.");
		}
		else {
			accountService.registration(account);
		}
		 
	}
}
