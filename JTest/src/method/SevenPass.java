package method;

import java.util.Scanner;

/**
 * SevenPass 逢7和7的倍数都过，打印它们
 * Date : 2020/8/23 12:33
 * Author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class SevenPass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数！");
        int num =sc.nextInt();
        getNum(num);
    }

    public static void getNum(int num) {
        for (int i = 1; i <= num; i++) {
            if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
