package com.arrarylist;

import java.util.Hashtable;

/**
 * Hashtable的用法
 *
 * @author jiaong
 * @date 2018/4/2 14:19
 */
public class Demo6 {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        Emp emp1 = new Emp("x01", "aa", 1.6f);
        hashtable.put("x01", emp1);
    }
}
