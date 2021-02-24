package array;

/**
 * ArrayMin
 * date : 2020/8/20 20:28
 * author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {12, 22, 64, 77, 9};
        int min = arr[0];

        for (int i = 1; i < arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Min :" + min);
    }
}
