package arrary;

/**
 * ArrayMax
 * date : 2020/8/20 20:19
 * author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {16, 45, 23, 67, 36};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Max：" + max);
    }
}
