package base;

/**
 * @author jiaong
 * @date 2017年11月16日 打印菱形
 */
public class Test4 {

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // 1->3 2->2 3->1 4->0...打印层
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            // 1->1 2->3 3->5 4->7... 打印*
            if (i <= (n + 1) / 2) {
                for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                    // 判断是否是顶层或者是底层
                    if (i == 1) {
                        System.out.print("*");
                    } else {
                        // 打印第一个*和最后一个*,其他为空
                        if (j == 1 || j == (i - 1) * 2 + 1) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                }
            } else {

            }
            System.out.println();
        }
    }

}
