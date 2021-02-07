package base;

/**
 * @author jiaong
 * @date 2017年11月16日
 * 打印金字塔边框
 */
public class Test3 {
    public static void main(String[] args) {
        int n = 6;
        for (int i = 1; i <= n; i++) {
            //1->3 2->2 3->1 4->0...打印层
            for (int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            //1->1 2->3 3->5 4->7... 打印*
            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
                //判断是否是顶层或者是底层
                if (i == 1 || i == n) {
                    System.out.print("*");
                } else {
                    //打印第一个*和最后一个*,其他为空
                    if (j == 1 || j == (i - 1) * 2 + 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

}
