package gui.com.test;

import javax.swing.*;
import java.awt.*;

public class Demo2 extends JFrame{
    JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7;
    public static void main(String[] args) {
        Demo2 demo2=new Demo2();
    }
    public Demo2(){

        // 创建组件
        jb1=new JButton("按钮1");
        jb2=new JButton("按钮2");
        jb3=new JButton("按钮3");
        jb4=new JButton("按钮4");
        jb5=new JButton("按钮5");
        jb6=new JButton("按钮6");
        jb7=new JButton("按钮7");

        //  添加组件
        this.add(jb1);
        this.add(jb2);
        this.add(jb3);
        this.add(jb4);
        this.add(jb5);
        this.add(jb6);
        this.add(jb7);

        // 设置布局管理器
        this.setLayout(new FlowLayout(FlowLayout.LEFT));

        // 设置窗体属性
        this.setTitle("流式布局");
        this.setSize(300,300);
        this.setLocation(200,200);
        // 禁止改变窗体大小
        this.setResizable(false);
        // 显示
        this.setVisible(true);
        // 关闭
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
