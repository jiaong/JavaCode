package String;

import java.util.Scanner;

/**
 * StringBuilderReverse
 * 通过StringBuilder反转字符串
 *
 * @Version : 1.0
 * @Author : jiaong
 * @Email : jiaong.yy@gmail.com
 * @Date : 2021/2/22 20:14
 */
public class StringBuilderReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串！");
        String line = sc.nextLine();
        String s = myReverse(line);
        System.out.println("字符串反转为: " + s);
    }

    public static String myReverse(String s) {

        // StringBuilder sb = new StringBuilder(s);
        // sb.reverse();
        // String ss = sb.toString();
        // return ss;

        // 上面4行代码合并成一行

        return new StringBuilder(s).reverse().toString();
    }
}
