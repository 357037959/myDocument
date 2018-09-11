package com.xhx.springboot.entity;

import javax.persistence.*;

/**
 * @author xuhaixing
 * @date 2018/4/28 10:29
 */
@Entity(name = "Acc")
@Table(name = "account")
public class Account {
    @Id
    private int id;
    private String name;
    private Double money;
    @Version
    private int version;


    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}
