package com.system.senhong.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.system.senhong.model.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

}
