package com.spring.mongo.controller;

import com.spring.mongo.entity.Account;
import com.spring.mongo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService service;

    @PostMapping("/save")
    public void saveAccount(@RequestBody Account account) {
        service.save(account);
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Integer id) {
        return service.getAccountById(id);
    }
}
