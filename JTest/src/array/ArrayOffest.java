package array;

import java.util.Scanner;

/**
 * ArrayOffest 数组索引
 * date : 2020/8/31 11:36
 * author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class ArrayOffest {
    public static void main(String[] args) {
        int[] arr = {12, 55, 23, 56, 100};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入大于等于零的正整数！");
        int number = sc.nextInt();
        int index = getIndex(arr, number);
        System.out.println(index);

    }

    public static int getIndex(int[] arr, int number) {
        // 定义一个索引变量。初始值位-1
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                index = i;
                break;
            }
        }
        return index;
    }
}
