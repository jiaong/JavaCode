package String;

import java.util.Scanner;

/**
 * ScannerDemo
 * 获取键盘录入数据
 *
 * @Version : 1.0
 * @Author : jiaong
 * @Email : jiaong.yy@gmail.com
 * @Date : 2021/2/6 16:34
 */
public class ScannerDemo {
    public static void main(String[] args) {
        // create a new Scanner
        Scanner sc = new Scanner(System.in);
        // get date
        System.out.println("Please enter a string data！");
        String line = sc.nextLine();
        // Output result
        System.out.println("The data you entered is: " + line);
    }
}
