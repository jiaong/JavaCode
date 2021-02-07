package gui.com.test;

import javax.swing.*;
import java.awt.*;

/**
 * 多种布局管理器混合使用
 */
public class Dome4 extends JFrame {
    JPanel jp1,jp2;
    JButton jb1,jb2,jb3,jb4,jb5,jb6;

    public static void main(String[] args) {
        Dome4 dome4=new Dome4();
    }
    public Dome4(){
        // 创建组件
        // JPanel布局默认是FlowLayout
        jp1=new JPanel();
        jp2=new JPanel();

        jb1=new JButton("西瓜");
        jb2=new JButton("苹果");
        jb3=new JButton("荔枝");
        jb4=new JButton("橘子");
        jb5=new JButton("香蕉");
        jb6=new JButton("葡萄");
        // 设置布局
        // 添加JPanel
        jp1.add(jb1);
        jp1.add(jb2);
        jp2.add(jb3);
        jp2.add(jb4);
        jp2.add(jb5);
        // 把Panel加人JFrame
        this.add(jp1, BorderLayout.NORTH);
        this.add(jb6,BorderLayout.CENTER);
        this.add(jp2,BorderLayout.SOUTH);

        // 设置窗体属性
        this.setTitle("混合布局");
        this.setSize(300,200);
        this.setLocation(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
