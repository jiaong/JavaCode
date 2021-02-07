package method;

/**
 * MethodArrayMax 数组最大值
 * Date : 2020/8/21 19:03
 * Author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class MethodArrayMax {
    public static void main(String[] args) {
        int[] arr = {12, 32, 45, 31};
        int number = getMax(arr);
        System.out.println(number);
    }

    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
