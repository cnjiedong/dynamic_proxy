package com.ljd.proxy.jdk;

/**
 * Created by user34 on 2018/3/24.
 */
public class TestProxy {
    public static void main(String[] args) {

        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        Person person = (Person) new HomeLink().getInstance(new Master("1", "2", "3"));
        person.searchHouse();
        String solution = person.think("4", "5", "6");
        System.out.println(solution);
        System.out.println("proxy end");
    }
}


