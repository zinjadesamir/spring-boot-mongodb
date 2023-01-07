package com.spring.mongo.service;

import com.spring.mongo.entity.Account;

public interface AccountService {
    void save(Account account);
    Account getAccountById(Integer id);
}
