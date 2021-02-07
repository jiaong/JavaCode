package base;

import java.util.Scanner;

/**
 * SumTest2 Dubug查看方法调用
 * Date : 2020/8/23 12:08
 * Author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class SumTest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数！");
        int a = sc.nextInt();
        System.out.println("请输入第二个数！");
        int b = sc.nextInt();
        System.out.println(getMax(a, b));
    }

    public static int getMax(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
