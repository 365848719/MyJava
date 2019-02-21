package com.cis.entity;

public class Cat extends Animal {

    @Override
    protected String getName() {

        String name = super.getName();

        return name + "12";
    }

    public String doSomething(){
        return "hello world !";
    }

}
