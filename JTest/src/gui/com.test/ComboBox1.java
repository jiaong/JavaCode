package gui.com.test;
/**
 * 下拉框组件
 */

import javax.swing.*;
import java.awt.*;

public class ComboBox1 extends JFrame {
    JPanel jp1, jp2;
    JLabel jlb1, jlb2;
    JComboBox jcb;
    JList jlist;
    JScrollPane jsp;

    public static void main(String[] args) {
        ComboBox1 cb = new ComboBox1();
    }

    public ComboBox1() {
        jp1 = new JPanel();
        jp2 = new JPanel();
        jlb1 = new JLabel("你的籍贯");
        jlb2 = new JLabel("旅游地点");
        String[] jg = {"北京", "上海", "广州", "深圳"};
        jcb = new JComboBox(jg);
        String[] dc = {"天安门", "外滩", "长城", "金字塔"};
        jlist = new JList(dc);

        // 设置显示多少个选项
        jlist.setVisibleRowCount(3);

        jsp = new JScrollPane(jlist);

        // 设置布局
        this.setLayout(new GridLayout(3, 1));

        jp1.add(jlb1);
        jp1.add(jcb);

        jp2.add(jlb2);
        jp2.add(jsp);

        this.add(jp1);
        this.add(jp2);

        this.setTitle("下拉框");
        this.setSize(300, 220);
        this.setLocation(200, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

}
