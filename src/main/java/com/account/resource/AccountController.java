package com.account.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.account.model.Account;
import com.account.service.IAccountService;

@RestController
@RequestMapping("/account-api")
public class AccountController {

	@Autowired
	IAccountService service;
	
	@GetMapping("/{id}")
	public Account getAccountById(@PathVariable("id") long id) {
		
		return service.fetchAccountById(id);
	}
	
	@PostMapping("/create")
	public Account createAccount(@RequestBody Account account) {
		return service.createAccount(account);
	}
}
