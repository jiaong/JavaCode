package array;

/**
 * ArrayEqual 比较数组是否相同
 * Date : 2020/8/30 15:03
 * Author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class ArrayEqual {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean b = compare(arr, arr2);
        System.out.println(b);
    }

    public static boolean compare(int[] arr, int[] arr2) {
        // 如果2个数组长度不同，返回false
        if (arr.length != arr2.length) {
            return false;
        }
        // 比较数组元素值是不是相同
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
