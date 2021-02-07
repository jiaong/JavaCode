package base;

import java.util.Scanner;

/**
 * SumTest1 求偶数之和 v 2.0
 * Date : 2020/8/21 22:55
 * Author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class SumTest1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();
        System.out.println(number+"之间的偶数和为："+getSum(number));
    }

    public static int getSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
