package com.account.service;

import java.util.Date;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.account.model.Account;
import com.account.repository.AccountRepo;

@Transactional(rollbackOn = Exception.class)
@Service
public class AccountService implements IAccountService{

	@Autowired
	private AccountRepo repo;
	
	@Override
	public Account createAccount(Account account) {
		account.setCreatedDate(new Date());
		account.setUpdatedDate(new Date());
		return repo.save(account);
	}

	@Override
	public Account fetchAccountById(long id) {
		return repo.findById(id).isPresent()?repo.findById(id).get():null;
	}

}
