package com.turing.sb02.entity;

import java.util.Date;

/**
 * @Author 长沙图灵科技学院
 * @Company www.tulingedu.com
 */
public class Student {
    private int id;
    private String name;

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

    public static void main(String[] args) {
        String date = new Date().toString();
    }
}
