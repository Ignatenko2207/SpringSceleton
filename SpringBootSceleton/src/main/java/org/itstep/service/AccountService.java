package org.itstep.service;

import org.itstep.dao.AccountDAO;
import org.itstep.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

	@Autowired
	AccountDAO accountDAO;
	
	public Account save(Account account) {
		return accountDAO.save(account);
	}
		
}
