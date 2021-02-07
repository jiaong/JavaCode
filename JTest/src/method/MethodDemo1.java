package method;

/**
 * MethodDemo1
 * Date : 2020/8/20 22:21
 * Author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class MethodDemo1 {
    public static void main(String[] args) {

        boolean flag = isEvenNumber(10);
        System.out.println(flag);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
