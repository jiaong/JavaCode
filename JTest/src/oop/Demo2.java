package oop;
//构造方法
public class Demo2 {
    int age;
    String name;
    public static void main(String[] args){
        Demo2 d=new Demo2();
        Demo2 d1=new Demo2(1);
        Demo2 d2=new Demo2(2,"lisi");
    }
    public Demo2(){
        System.out.println("zero");
    }
    public Demo2(int age){
        this.age=age;
        System.out.println("one");
    }
    public Demo2(int age, String name){
        this.age=age;
        this.name=name;
        System.out.println("two");
    }
}
