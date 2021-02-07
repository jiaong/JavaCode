package com.test;

import java.util.ArrayList;

/**
 * 泛型的必要性
 *
 * @author jiaong
 * @date 2018/4/2 15:54
 */
public class Test {
    public static void main(String[] args) {
        ArrayList<Dog> al = new ArrayList<Dog>();
        //  创建一只狗
        Dog dog1 = new Dog();
        //  放入集合中
        //  Dog temp = (Dog) al.get(0);
        //  容易出错
        //  Cat temp = (Cat) al.get(0);
        Dog temp=al.get(0);
    }
}

class Cat {
    private String color;
    private int age;

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Dog {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}