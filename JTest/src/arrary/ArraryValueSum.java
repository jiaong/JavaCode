package arrary;

/**
 * 数组元素值总和
 */
public class ArraryValueSum {
    public static void main(String[] args) {
        float arr[] = new float[6];
        arr[0] = 3;
        arr[1] = 5;
        arr[2] = 1;
        arr[3] = 3.4f;
        arr[4] = 2;
        arr[5] = 50;

        float all = 0;
        for (int i = 0; i < 6; i++) {
            all += arr[i];
        }
        System.out.println(all);
    }
}
