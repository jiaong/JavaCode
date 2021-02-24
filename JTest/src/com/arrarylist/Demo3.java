package com.arrarylist;

import java.util.Vector;

/**
 * Vector的用法
 *
 * @author jiaong
 * @date 2018/4/2 13:35
 */
public class Demo3 {
    public static void main(String[] args) {
        Vector vv = new Vector();
        Emp emp3 = new Emp("n1", "cc", 1.4f);
        vv.add(emp3);
        for (int i = 0; i < vv.size(); i++) {
            Emp emp = (Emp) vv.get(i);
            System.out.println(emp.getName());
        }
    }
}
