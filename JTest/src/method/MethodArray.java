package method;

/**
 * MethodArray 数组遍历
 * Date : 2020/8/21 18:49
 * Author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class MethodArray {
    public static void main(String[] args) {
        int[] arr = {12, 43, 22, 56, 78};
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
        System.out.print(" ]");
    }
}
