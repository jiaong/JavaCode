package com.test;

public class Test5 {
    public static void main(String[] args) {
        Son1 s = new Son1(1, "lisi");
    }
}

class Base {
    int age;
    String name;

    public Base(int age, String name) {
        System.out.println("Base");
        this.age = age;
        this.name = name;
    }
}

class Son1 extends Base {
    public Son1(int age, String name) {
        super(age, name);
        System.out.println("Son1");

    }
}