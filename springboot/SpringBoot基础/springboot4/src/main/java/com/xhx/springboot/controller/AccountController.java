package com.xhx.springboot.controller;

import com.xhx.springboot.entity.Account;
import com.xhx.springboot.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author xuhaixing
 * @date 2018/5/2 9:55
 */
@RestController
@RequestMapping("account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public int add(@RequestBody Account account) {
        return accountService.add(account);
    }

    @RequestMapping(value = "update", method = RequestMethod.POST)
    public int update0(@RequestBody Account account) {
        return accountService.update(account);
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public int delete(@RequestParam int id) {
        return accountService.delete(id);
    }

    @RequestMapping(value = "findById", method = RequestMethod.POST)
    public Account findById(@RequestParam int id) {
        return accountService.findById(id);
    }

    @RequestMapping(value = "findList", method = RequestMethod.POST)
    public List<Account> findList() {
        return accountService.findList();
    }

}
