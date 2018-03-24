package com.ljd.proxy;

/**
 * Created by user34 on 2018/3/24.
 */
public class TestProxy {
    public static void main(String[] args) {
        Person person = (Person) new HomeLink().getInstance(new Master());
        person.searchHouse();
    }
}
