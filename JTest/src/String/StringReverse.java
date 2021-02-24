package String;

import java.util.Scanner;

/**
 * StringReverse
 * 定义一个方法，实现字符串反转
 * 键盘录入 abc，输出结果 cba
 *
 * @Version : 1.0
 * @Author : jiaong
 * @Email : jiaong.yy@gmail.com
 * @Date : 2021/2/8 15:09
 */
public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个字符串！");
        String line = sc.nextLine();
        String s=reverse(line);
        System.out.println("字符串反转为: " + s);
    }

    // 自定义反转方法
    public static String reverse(String s) {
        String ss = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            ss += s.charAt(i);
        }
        return ss;
    }
}

