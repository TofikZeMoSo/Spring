package com.spring.demo.aop.DAO;

import org.springframework.stereotype.Component;


@Component
public class AccountDAO {

    public void addAccount() {

        System.out.println(getClass() + ": DOING MY DB WORK: ADDING AN ACCOUNT");

    }
}
