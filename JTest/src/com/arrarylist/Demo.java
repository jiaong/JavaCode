package com.arrarylist;
//  先引用包
import java.util.*;

/**
 *  演示Java集合的用法
 */

public class Demo {
    public static void main(String[] args) {
        //  定义ArrayList对象
        ArrayList al=new ArrayList();
        //  显示大小
        System.out.println(" al大小："+al.size());
        //  向al中加入数据（类型是object）
        //  创建一个员工
        Clerk   clerk1=new Clerk("宋江",50,1000);
        Clerk   clerk2=new Clerk("吴用",45,1200);
        Clerk   clerk3=new Clerk("林冲",35,1300);
        //  将职员加入al中
        al.add(clerk1);
        al.add(clerk2);
        al.add(clerk3);
        //  可以重复加入
        al.add(clerk1);
        //  显示大小
        System.out.println(" al大小："+al.size());
        //  访问对象
        //  Clerk   temp=(Clerk) al.get(0);
        //  System.out.println(temp.getName());

        //  从al中删除对象
        al.remove(3);
        //  遍历al所有对象
        for (int i=0;i<al.size();i++){
            Clerk temp=(Clerk)al.get(i);
            System.out.println(temp.getName());
        }

    }
}
//  定义一个职员类
class   Clerk{

    private String name;
    private int age;
    private float sal;

    public Clerk(String name,int age,float sal){
        this.name=name;
        this.age=age;
        this.sal=sal;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getSal() {
        return sal;
    }

}
