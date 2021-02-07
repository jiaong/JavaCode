package recurrence;

/**
 * Chicken 百钱百鸡：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。
 * date : 2020/8/28 16:20
 * author : jiaong
 * Email : jiaong.yy@gmail.com
 */
public class Chicken {
    public static void main(String[] args) {
        for (int x = 0; x <= 20; x++) {
            for (int y = 0; y <= 33; y++) {
                int z = 100 - x - y;
                if (z % 3 == 0 && 5 * x + 3 * y + z / 3 == 100) {
                    System.out.println("鸡翁：" + x + " 鸡母：" + y + " 鸡雏：" + z);
                }
            }
        }
    }
}
