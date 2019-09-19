package com.account.service;

import com.account.model.Account;

public interface IAccountService {
	
	Account createAccount(Account account);
	Account fetchAccountById(long id);
	
	

}
