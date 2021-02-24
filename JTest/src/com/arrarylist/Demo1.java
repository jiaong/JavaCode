package com.arrarylist;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Demo1 {
    public static void main(String[] args) throws Exception {
        //  创建EmpManage对象
        EmpManage em = new EmpManage();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //  简易菜单
        while (true) {
            System.out.println("请选择你要进行的操作:");
            System.out.println("1:表示添加一个雇员");
            System.out.println("2:查找一个雇员");
            System.out.println("3:修改一个雇员工资");
            System.out.println("4:删除一个雇员");
            System.out.println("5:显示所有雇员");
            System.out.println("6:退出系统");

            String operType = br.readLine();
            if (operType.equals("1")) {
                System.out.println("请输入编号！");
                String empNo = br.readLine();
                System.out.println("请输入名字！");
                String name = br.readLine();
                System.out.println("请输入工资");
                float sal = Float.parseFloat(br.readLine());
                Emp emp = new Emp(empNo, name, sal);
                em.addEmp(emp);
            } else if (operType.equals("2")) {
                System.out.println("请输入编号！");
                String empNo = br.readLine();
                em.showInfo(empNo);
            } else if (operType.equals("3")) {
                System.out.println("请输入编号！");
                String empNo = br.readLine();
                System.out.println("请输入工资");
                float newSal = Float.parseFloat(br.readLine());
                em.updateSal(empNo, newSal);
            } else if (operType.equals("4")) {
                System.out.println("请输入编号！");
                String empNo = br.readLine();
                em.delEmp(empNo);
            } else if (operType.equals("5")) {
                em.showALl();
            } else if (operType.equals("6")) {
                //退出系统
                System.exit(0);
            }
        }
    }
}

//  雇员管理类
class EmpManage {
    private ArrayList al = null;

    //  构建
    public EmpManage() {
        al = new ArrayList();
    }

    //  加入员工
    public void addEmp(Emp emp) {
        al.add(emp);
    }

    //  显示某个员工信息
    public void showInfo(String empNo) {
        //  遍历整个ArraryList
        for (int i = 0; i < al.size(); i++) {
            //  取出Emp对象
            Emp emp = (Emp) al.get(i);
            //  比较编号
            if (emp.getEmpNo().equals(empNo)) {
                System.out.println("找到该员工，他的信息是：");
                System.out.println("编号=" + empNo);
                System.out.println("名字=" + emp.getName());
                System.out.println("工资=" + emp.getSal());
            }
        }
    }

    //  显示所有员工信息
    public void showALl() {
        //  遍历整个ArraryList
        for (int i = 0; i < al.size(); i++) {
            //  取出Emp对象
            Emp emp = (Emp) al.get(i);
            System.out.println("编号=" + emp.getEmpNo());
            System.out.println("名字=" + emp.getName());
            System.out.println("工资=" + emp.getSal());

        }
    }

    //  修改工资
    public void updateSal(String empNo, float newsal) {
        for (int i = 0; i < al.size(); i++) {
            Emp emp = (Emp) al.get(i);
            if (emp.getEmpNo().equals(empNo)) {
                emp.setSal(newsal);
            }
        }
    }

    //  删除员工
    public void delEmp(String empNo) {
        for (int i = 0; i < al.size(); i++) {
            Emp emp = (Emp) al.get(i);
            if (emp.getEmpNo().equals(empNo)) {
                al.remove(i);
            }
        }
    }
}

//  雇员类
class Emp {
    //  编号
    private String empNo;
    private String name;
    private float sal;

    public Emp(String empNo, String name, float sal) {
        this.empNo = empNo;
        this.name = name;
        this.sal = sal;
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSal() {
        return sal;
    }

    public void setSal(float sal) {
        this.sal = sal;
    }
}