package org.itstep.service;

import org.itstep.model.Account;
import org.springframework.beans.factory.annotation.Autowired;

public class TestService {

	@Autowired
	AccountService service;
		
	public void testSpring() {
		Account account = new Account();
		account.setLogin("Alex");
		account.setPassword("123456");
		
		service.save(account);
	}
}
