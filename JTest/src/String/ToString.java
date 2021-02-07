package String;

/**
 * ToString
 * 拼接字符串
 * 例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
 *
 * @Version : 1.0
 * @Author : jiaong
 * @Email : jiaong.yy@gmail.com
 * @Date : 2021/2/7 16:18
 */
public class ToString {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        // 调用拼接方法
        String s = arrayToString(arr);
        System.out.println(s);
    }

    // 自定义拼接方法
    public static String arrayToString(int[] arr) {
        String s = "";
        s += "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
            } else {
                s += arr[i];
                s += ",";
            }
        }
        s += "]";
        return s;
    }
}
