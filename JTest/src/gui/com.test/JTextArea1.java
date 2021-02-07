package gui.com.test;

import javax.swing.*;
import java.awt.*;

/**
 * JTextArea1 多文本框
 * date : 2020/5/1 15:45:34
 */
public class JTextArea1 extends JFrame {
    JTextArea jta = null;
    JScrollPane jsp = null;
    JPanel jp1 = null;
    JComboBox jcb = null;
    JTextField jtf = null;
    JButton jb = null;

    public static void main(String[] args) {
        JTextArea1 jTextArea1 = new JTextArea1();
    }

    public JTextArea1() {
        jta = new JTextArea();
        jsp = new JScrollPane(jta);
        jp1 = new JPanel();
        String[] chatter = {"Tom", "Lucy"};
        jcb = new JComboBox(chatter);
        jtf = new JTextField(10);
        jb = new JButton("发送");
        //设置布局
        //添加组件
        jp1.add(jcb);
        jp1.add(jtf);
        jp1.add(jb);
        // 加入JFrame
        this.add(jsp);
        this.add(jp1, BorderLayout.SOUTH);

        //
        this.setIconImage(new ImageIcon("qq.gif").getImage());
        this.setTitle("聊天界面");
        this.setSize(300, 200);
        this.setLocation(200, 200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
