package com.arrarylist;

import java.util.HashMap;
import java.util.Iterator;

/**
 * HashMap
 *
 * @author jiaong
 * @date 2018/4/2 13:55
 */
public class Demo5 {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        Emp emp5 = new Emp("s001", "花荣", 3.4f);
        Emp emp6 = new Emp("s002", "武松", 3.2f);
        //  将emp加入hm中
        hm.put("s001", emp5);
        hm.put("s002", emp6);
        if (hm.containsKey("s002")) {
            System.out.println("有该员工！");
            //  取出键值
            System.out.println("名字：" + emp6.getName());
        } else {
            System.out.println("没有该员工！");
        }
        //  遍历HashMap中所有的key和value
        //  Iterator迭代器
        Iterator iterator = hm.keySet().iterator();
        while (iterator.hasNext()) {
            //  取出key
            String key = iterator.next().toString();
            //  通过key取出value
            Emp emp = (Emp) hm.get(key);
            System.out.println("名字=" + emp.getName());
            System.out.println("工资=" + emp.getSal());
        }
    }
}
