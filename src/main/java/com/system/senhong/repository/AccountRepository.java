package com.system.senhong.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.system.senhong.model.Account;

public interface AccountRepository extends JpaRepository<Account, String> {

	@Query(value = "select * from account where email = ?1 and password = ?2", nativeQuery = true)
	Account loginByEmailAndPassword(String email, String password);

	Account findByEmail(String email);
}
