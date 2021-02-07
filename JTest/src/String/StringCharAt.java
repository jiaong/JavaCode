package String;

import java.util.Scanner;

/**
 * StringCharAt
 * 键盘录入一个字符串，使用程序实现在控制台遍历该字符串
 * 思路：
 * 键盘录入一个字符串，用 Scanner 实现
 * 遍历字符串，首先要能够获取到字符串中的每一个字符
 *  public char charAt(int index)：返回指定索引处的char值，字符串的索引也是从0开始的
 * 遍历字符串，其次要能够获取到字符串的长度
 *  public int length()：返回此字符串的长度
 *  数组的长度：数组名.length
 *  字符串的长度：字符串对象.length()
 *
 * @Version : 1.0
 * @Author : jiaong
 * @Email : jiaong.yy@gmail.com
 * @Date : 2021/2/7 15:44
 */
public class StringCharAt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串！");
        String line = sc.nextLine();
        for (int i = 0; i < line.length(); i++) {
            System.out.print(line.charAt(i) + " ");
        }
    }
}
