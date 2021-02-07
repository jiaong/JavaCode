package gui.com.test;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    // 定义组件
    JPanel jp1,jp2,jp3;
    JLabel jlb1,jlb2;
    JButton jb1,jb2;
    JTextField jtf1,jtf2;

    public static void main(String[] args) {
        Login lg= new Login();
    }
    public Login(){
        // 创建组件
        jp1=new JPanel();
        jp2=new JPanel();
        jp3=new JPanel();

        jlb1=new JLabel("用户名：");
        jlb2=new JLabel("密  码：");

        jb1= new JButton("登录");
        jb2=new JButton("取消");

        jtf1=new JTextField(20);
        jtf2=new JPasswordField(20);

        // 设置布局管理
        this.setLayout(new GridLayout(3,1));
        // 加入各个组件
        jp1.add(jlb1);
        jp1.add(jtf1);

        jp2.add(jlb2);
        jp2.add(jtf2);

        jp3.add(jb1);
        jp3.add(jb2);
        // 加入到JFrame
        this.add(jp1);
        this.add(jp2);
        this.add(jp3);
        // 设置窗体属性
        this.setTitle("登录");
        this.setSize(300,200);
        this.setLocation(200,200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
