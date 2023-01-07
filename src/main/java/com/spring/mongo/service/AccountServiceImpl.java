package com.spring.mongo.service;

import com.spring.mongo.entity.Account;
import com.spring.mongo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

    @Autowired
    private AccountRepository repository;

    @Override
    public void save(Account account) {
        repository.save(account);
    }

    @Override
    public Account getAccountById(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
