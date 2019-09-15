package com.ley.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ley.mapper.AccountMapper;
import com.ley.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class AccountService extends ServiceImpl<AccountMapper, Account> {

    @Autowired
    AccountMapper accountDao;

    public List<Account> selectAccountList() {
        Page page = new Page(2, 3);
        IPage<Account> accounts = accountDao.selectAccountList(page,"name1");
        return accounts.getRecords();
    }

    public void creatAccounts() {
        List<Account> accounts = new ArrayList<>(100);
        for(int i = 0; i < 100; i++) {

            Account account = new Account(
                    UUID.randomUUID().toString(),
                    "name" + i,
                    "this is address");

            System.out.println(account.toString());
            accounts.add(account);
        }
        super.saveBatch(accounts);
    }
}
