package com.ley.controller;

import com.ley.entity.Account;
import com.ley.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AccountController {

    @Autowired private AccountService accountService;

    @RequestMapping("query")
    public List<Account> selectAccount() {
        return accountService.selectAccountList();
    }

    @RequestMapping("insert")
    public String insertAccount() {
        accountService.creatAccounts();
        return "success";
    }
}
