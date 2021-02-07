package jpanel;

import javax.swing.*;
import java.awt.*;

/**
 * MyJpanel java绘图
 * date : 2020/5/2 19:49:22
 */
public class MyJanel extends JFrame {
    MyPanel mp = null;

    public static void main(String[] args) {
        MyJanel myJanel = new MyJanel();
    }

    public MyJanel() {
        mp = new MyPanel();
        this.add(mp);
        this.setTitle("画个圆圈");
        this.setLocation(300, 300);
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel {
    // 重写JPanel的paint方法
    // Graphics 是绘图的重要类，可以理解为一只画笔
    public void paint(Graphics g) {
        // 调用父类
        super.paint(g);
        // System.out.println("paint被调用！");
        // 画一个圆圈
        // g.drawOval(50, 50, 200, 200);
        // 画根直线
        // g.drawLine(10,10,100,100);
        // 画个矩形
        // g.drawRect(10,10,40,60);
        // 画个填充矩形
//        g.setColor(Color.blue);
//        g.fillRect(10, 10, 40, 60);
//        g.setColor(Color.red);
//        g.fillRect(70, 70, 60, 40);
        // 在面板上画图片
        // Image im =
        //        Toolkit.getDefaultToolkit().getImage
        //               (Panel.class.getResource("/1.jpg"));
        // 现实
        // g.drawImage(im, 20, 20, 160, 90, this);
        g.setColor(Color.red);
        g.setFont(new Font("华文彩云",Font.BOLD,40));
        g.drawString("hello world!",100,100);
    }
}