package array;

import java.util.Scanner;

/**
 * AvgArray 有6个评委为参赛的选手打分，分数为0-100的整数分。 选手的最后得分为：去掉一个最高分和一
 * 个最低分后 的4个评委平均值 (不考虑小数部分)。
 * Date : 2020/9/13 19:30
 * Author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class AvgArray {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        // 循环输入6个评委分数
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入" + (i + 1) + "个评委打分：");
            arr[i] = sc.nextInt();
        }
        printArray(arr);
        System.out.println(getMax(arr));
        System.out.println(getMin(arr));
        System.out.println(getAvg(arr));
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    //
    public static int getAvg(int[] arr) {
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        avg = (sum - getMin(arr) - getMax(arr)) / (arr.length - 2);
        return avg;
    }

    // 遍历数组
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.println("]");
    }
}
