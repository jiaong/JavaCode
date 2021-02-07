package gui.com.test;

import javax.swing.*;

/**
 * Dict
 * date : 2020/5/1 11:09:04
 */
public class Dict extends JFrame {
    // 定义组件
    JSplitPane jsp;
    JList jlist;
    JLabel jl1;
    public static void main(String[] args) {
        Dict dict=new Dict();
    }
    public Dict(){
        // 创建组件
        String []words={"none","b","c"};
        jlist=new JList(words);
        jl1=new JLabel(new ImageIcon("/src/gui/com.test/ciba.GIF"));
        // 拆分窗体
        jsp =new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlist,jl1);
        // 可变化
        jsp.setOneTouchExpandable(true);
        // 设置布局管理器

        // 添加组件

        this.add(jsp);

        this.setTitle("字典");
        this.setSize(400,300);
        this.setLocation(200,200);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
