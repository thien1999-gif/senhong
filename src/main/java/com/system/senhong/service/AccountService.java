package com.system.senhong.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.senhong.model.Account;
import com.system.senhong.repository.AccountRepository;

@Service
public class AccountService {

	@Autowired
	private AccountRepository accountRepository;

	public List<Account> getAll() {
		return accountRepository.findAll();
	}

	public Account loginByEmailAndPassword(String email, String password) {
		// TODO Auto-generated method stub
		return accountRepository.loginByEmailAndPassword(email,password);
	}

	public Account registration(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account);
	}

	public Account findByEmail(String email) {
		// TODO Auto-generated method stub
		return accountRepository.findByEmail(email);
	}

	
	
}
