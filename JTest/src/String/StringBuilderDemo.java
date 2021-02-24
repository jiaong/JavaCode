package String;

/**
 * StringBuilderDemo
 * StringBuilder 的添加和反转
 * StringBuilder 和 String 相互转化
 *
 * @Version : 1.0
 * @Author : jiaong
 * @Email : jiaong.yy@gmail.com
 * @Date : 2021/2/8 15:51
 */
public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 添加数据
        // sb.append("Hello ");
        // sb.append("World !");
        // 链式编程
        sb.append("Hello ").append("World ! ").append("Java");
        System.out.println(sb);
        // 反转
        sb.reverse();
        System.out.println(sb);

        // StringBuilder 转换 String
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello");
        String s = sb2.toString();
        System.out.println(s);

        // String 转换 StringBuilder
        String ss = "World";
        StringBuilder sb3 = new StringBuilder(ss);
        System.out.println(ss);
    }
}
