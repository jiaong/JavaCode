package String;

import java.util.Scanner;

/**
 * StringCount
 * 统计字符次数\
 * 键盘录入一个字符串，统计该字符串中大写字母字符，小写字母字符，数字字符出现的次数(不考虑其他字符)
 * 假如ch是一个字符，我要判断它属于大写字母，小写字母，还是数字，直接判断该字符是否在对应的范围即可
 * 大写字母：ch>='A' && ch<='Z'
 * 小写字母： ch>='a' && ch<='z'
 * 数字： ch>='0' && ch<='9'
 *
 * @Version : 1.0
 * @Author : jiaong
 * @Email : jiaong.yy@gmail.com
 * @Date : 2021/2/7 16:00
 */
public class StringCount {
    public static void main(String[] args) {
        // 大写统计
        int bigCount = 0;
        // 小写统计
        int smallCount = 0;
        // 数字统计
        int numberCount = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串！");
        String line = sc.nextLine();
        for (int i=0;i<line.length();i++){
            char ch=line.charAt(i);
            if (ch>='A' && ch<='Z'){
                bigCount++;
            }else if(ch>='a' && ch<='z'){
                smallCount++;
            }else if(ch>='0' && ch<='9'){
                numberCount++;
            }
        }
        System.out.println("大写字母："+bigCount+"个");
        System.out.println("小写字母："+smallCount+"个");
        System.out.println("数字："+numberCount+"个");
    }
}
