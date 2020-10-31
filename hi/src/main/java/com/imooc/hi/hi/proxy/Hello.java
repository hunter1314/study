package com.imooc.hi.hi.proxy;

public class Hello implements IHello {

    @Override
    public void hello() {
        System.out.println("hello ...");
    }

}
