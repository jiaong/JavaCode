package com.arrarylist;

import java.util.Stack;

/**
 * Stack的用法
 *
 * @author jiaong
 * @date 2018/4/2 13:43
 */
public class Demo4 {
    public static void main(String[] args) {
        Stack sk=new Stack();
        Emp emp4=new Emp("q1","dd",1.5f);
        sk.add(emp4);
        for (int i=0;i<sk.size();i++){
            Emp  emp=(Emp) sk.get(i);
            System.out.println(emp.getName());
        }
    }
}
