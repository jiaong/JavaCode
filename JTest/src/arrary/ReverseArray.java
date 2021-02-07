package arrary;

/**
 * SwitchArray 反转数组
 * Date : 2020/9/13 19:06
 * Author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 6, 7, 8};
        reverse(arr);
        printArray(arr);
    }

    public static void reverse(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print("]");
    }
}
