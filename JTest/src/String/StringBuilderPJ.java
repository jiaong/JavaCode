package String;

/**
 * StringBuilderPJ
 * 拼接字符串
 * 定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，
 * 调用该方法，并在控制台输出结果。
 * 例如，数组为int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
 * 在方法中用 StringBuilder 按照要求进行拼接，并把结果转成 String 返回
 *
 * @Version : 1.0
 * @Author : jiaong
 * @Email : jiaong.yy@gmail.com
 * @Date : 2021/2/8 16:43
 */
public class StringBuilderPJ {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        String s = arrayToString(arr);
        System.out.println(s);
    }

    // 自定义拼接方法
    public static String arrayToString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}
