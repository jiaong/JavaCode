package method;

/**
 * ArgsDemo
 * Date : 2020/8/20 23:18
 * Author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class ArgsDemo {
    public static void main(String[] args) {
        int number = 100;
        System.out.println(number);
        change(number);
        System.out.println(change(number));
        System.out.println(number);
    }

    public static int change(int number) {
        return number = 200;
    }
}
