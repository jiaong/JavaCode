package base;

// 输出1-100内前5个可以被3整除的数
public class Test5 {

    public static void main(String[] args) {
        Test5 test5=new Test5();
    }
    public Test5(){
        int num = 1;
        int i = 1;
        while (i <= 100) {
            if (i % 3 == 0) {
                System.out.println("第"+num+"个数是："+i);
                num++;
            }
            if (num > 5) {
                break;
            }
            i++;
        }

    }
}