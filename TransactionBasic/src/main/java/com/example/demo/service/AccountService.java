package com.example.demo.service;

import com.example.demo.entity.Account;
import com.example.demo.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    private AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public void createAccount(Account account) {
        accountRepository.save(account);
    }
}
