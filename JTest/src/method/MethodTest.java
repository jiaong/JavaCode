package method;

/**
 * MethodTest
 * date : 2020/8/20 21:59
 * author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class MethodTest {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        getMax(a, b);
    }

    public static void getMax(int a, int b) {
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
