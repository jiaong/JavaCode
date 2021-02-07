package recurrence;

import java.util.Arrays;

public class Fab {
    public static void main(String args[]) {
        System.out.println(f(40));
    }

    public static long f(int index) {
        if (index < 1) {
            System.out.println("请输入大于1的整数");
            return -1;
        }
        if (index == 1 || index == 2) {
            return 1;
        }
        long f1 = 1l;
        long f2 = 1l;
        long f = 0;
        for (int i = 0; i < index - 2; i++) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        return f;
    }
}
