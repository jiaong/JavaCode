package com.test;

import java.lang.reflect.Method;

/**
 * java的反射机制
 *
 * @author jiaong
 * @date 2018/4/2 16:10
 */
public class Test2 {
    public static void main(String[] args) {
        //  Gen<String> gen=new Gen<String>("aaa");
        Gen<Bird> gen=new Gen<Bird>(new Bird());
        gen.showTypeName();
    }
}
class Bird{
    public void test1(){
        System.out.println("aa");

    }
    public void count(int a,int b){
        System.out.println(a+b);
    }
}
class Gen<T>{
    private T o;
    public Gen(T a){
        o=a;
    }
    //  获取T的类型名称
    public void showTypeName(){
        System.out.println("类型是："+o.getClass().getName());
        //  通过反射机制，获取该类型的信息（如属性，方法等）
        Method []m=o.getClass().getDeclaredMethods();
        //  打印
        for (int i=0;i<m.length;i++){
            System.out.println(m[i].getName());
        }
    }
}