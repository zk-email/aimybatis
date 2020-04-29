/**
 * @auther :ZK
 * @date : Created in 2020/3/17
 * @description :
 * @version: 1.0
 **/
package com.southwind.repository;

import com.southwind.entity.Account;

import java.util.List;

public interface AccountRepository {
    public int save(Account account);
    public int update(Account account);
    public int deleteById(long id);
    public List<Account> findAll();
    public Account findById(long id);
    public Account findByNameAndAge(String name,int age);
    public int count();
    public Integer count2();
    public String findNameById(long id);
    public Account findByAccount(Account account);
    public List<Account> findByIds(Account account);
}


