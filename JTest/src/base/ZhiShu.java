package base;

/**
 * ZiShu 输出101-200内的质数
 * date : 2020/5/5 22:37:59
 */
public class ZhiShu {
    public static void main(String[] args) {
        ZhiShu zhiShu = new ZhiShu();
    }

    public ZhiShu() {
        int num=0;
        for (int i = 101; i < 200; i += 2) {
            boolean zhishu = true;
            // 判断是否为质数
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    zhishu = false;
                    break;
                }
            }
            // 非质数跳过本次循环
            if (!zhishu) {
                continue;
            }
            num++;
            System.out.print(" "+i);

        }
        System.out.println();
        System.out.println("总共有"+num+"个质数");
    }
}
