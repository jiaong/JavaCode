package base;

import java.util.Arrays;
import java.util.Scanner;

/**
 * LotteryOdds
 * 这个程序用来计算抽奖中奖的概率。
 * 如果必须从 1 ~ 50 之间的数字中取 6 个数字来抽奖， 那么会有 (50 x 49 x 48 x 47 x 46 x 45)/
 * (1 x 2 x 3 x 4 x 5 x 6) 种可能的结果， 所以中奖的几率是 1/15 890 700。
 * date : 2020/6/30 21:18
 */
public class LotteryOdds {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("How many numbers you do need to draw? ");
        int k=in.nextInt();
        System.out.println("What is the highest number you can draw?");
        int n=in.nextInt();
        // n*(n-1)*(n-2)...*(n-K+1)/(1*2*3*...*k)
        int lotteryOdds=1;
        for (int i=1;i<=k;i++){
            lotteryOdds =lotteryOdds *(n-i+1)/i;
        }
        System.out.println("your odds are 1 in "+lotteryOdds+". good luck!");
    }
}
