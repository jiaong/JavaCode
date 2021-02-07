package gui.com.test;
import java.awt.*;
import javax.swing.*;

public class Demo extends JFrame {
    JButton jb1=null;
    public static void main(String[] args) {
       Demo demo=new Demo();

    }
    public Demo(){
        // 给窗体设置标题
        this.setTitle("hello world!");
        // 创建一个按钮
        jb1=new JButton("按钮1");
        // 设置大小，按像素
        this.setSize(300, 200);
        // 添加JButton组件
        this.add(jb1);
        // 设置初始位置
        this.setLocation(100,200);
        // 显示
        this.setVisible(true);
        // 关闭窗口，保证jvm也退出.
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}