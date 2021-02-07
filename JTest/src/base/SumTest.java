package base;

/**
 * Sum  求偶数之和
 * Date : 2020/8/21 22:26
 * Author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class SumTest {
    public static void main(String[] args) {
        int number = 20;
        System.out.println(getSum(number));

    }

    public static int getSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
