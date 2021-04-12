package com.system.senhong.service;

import java.util.List;

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
}
