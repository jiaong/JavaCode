package arrary;

/**
 * Two-dimensional array 二维数组
 */

public class TDArray {
    public static void main(String[] args) {
        int arr[][] = new int[4][6];
        arr[1][2] = 1;
        arr[2][1] = 2;
        arr[2][3] = 3;

        //  打印出图形
        //    行
        for (int i = 0; i < 4; i++) {
            //  列
            for (int j = 0; j < 6; j++) {
                System.out.print(arr[i][j] + " ");
            }
            //  换行
            System.out.println();
        }
    }
}
