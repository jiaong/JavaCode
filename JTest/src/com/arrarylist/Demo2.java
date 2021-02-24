package com.arrarylist;

import java.util.*;

/**
 * LinkedList
 *
 * @author jiaong
 * @date 2018/4/2 13:13
 */
public class Demo2 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Emp emp1 = new Emp("s1", "aa", 1.2f);
        Emp emp2 = new Emp("s2", "bb", 1.2f);
        //  表示把emp1加在链表的最前面
        ll.addFirst(emp1);
        ll.addFirst(emp2);
        for (int i = 0; i < ll.size(); i++) {
            System.out.println(((Emp) ll.get(i)).getName());
        }
    }
}
