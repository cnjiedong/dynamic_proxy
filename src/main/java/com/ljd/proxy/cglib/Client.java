package com.ljd.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * Created by user34 on 2018/3/24.
 */
public class Client {


    public static void main(String[] args){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloServiceImp.class);
        enhancer.setCallback(new HelloMethodInterceptor());
        HelloServiceImp helloService = (HelloServiceImp)enhancer.create();
        helloService.SayHello();
    }
}
