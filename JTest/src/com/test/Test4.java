package com.test;

import java.io.FileReader;

public class Test4 {
    public static void main(String[] args) {
        Father father=new Father();
        father.test1();
    }
}
class Father{
    private  Son son=null;
    public Father(){
        son=new Son();
    }
    public void test1(){
        System.out.println("1");
        try {
            son.test2();
        }catch (Exception e){
            System.out.println("Father");
            e.printStackTrace();
        }
    }
}
class Son{
    public void  test2() throws Exception{
        FileReader fr=null;
        fr =new FileReader("D:\\dd.txt");
    }
}
