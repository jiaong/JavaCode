package base;

import java.util.Arrays;
import java.util.Scanner;

/**
 * InputTest
 * date : 2020/6/29 23:32
 */
public class InputTest {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("What is your name?");
        String name=in.nextLine();

        System.out.println("How old are you?");
        int age=in.nextInt();

        System.out.println("Hello, "+name+" "+age);
    }
}
