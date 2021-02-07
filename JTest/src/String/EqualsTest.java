package String;

/**
 * EqualsTest
 * 字符串比较
 *
 * @Version : 1.0
 * @Author : jiaong
 * @Email : jiaong.yy@gmail.com
 * @Date : 2021/2/7 14:44
 */
public class EqualsTest {
    public static void main(String[] args) {

        // 构造方法的方式创建对象
        char[] chr = {'a', 'b', 'c'};
        String s1 = new String(chr);
        String s2 = new String(chr);

        // 直接赋值的方式创建对象
        String s3 = "abc";
        String s4 = "abc";

        // 比较字符串对象地址是否相同
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println("-------");

        // 比较字符串内容是否相同
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s3.equals(s4));
    }
}
