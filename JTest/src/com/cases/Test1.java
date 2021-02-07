package com.cases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 跳水运动，8个评委打分，去掉最高和最低分，求平均分
 * 找出最高分和最低分的评委
 * 找出最菜评委
 *
 * @author jiaong
 * @date 2018/4/2 22:47
 */
public class Test1 {
    public static void main(String[] args) {
        Judge judge = new Judge();
        System.out.println(judge.lastFen());
        System.out.println("最高分是第" + (judge.getHignFenIndex() + 1) + "个裁判");
        System.out.println("最低分是第" + (judge.getLowFenIndex() + 1) + "个裁判");
        System.out.println("最菜裁判是第" + (judge.getWorst() + 1) + "个");
    }
}

class Judge {
    // 定义一个可以存放8个元素数组
    float fens[] = null;
    int size = 4;

    //  构造函数
    public Judge() {
        fens = new float[size];
        //  初始化
        InputStreamReader rs = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(rs);

        try {
            for (int i = 0; i < fens.length; i++) {
                System.out.println("请输入第" + (i + 1) + "个裁判的评分！");
                fens[i] = Float.parseFloat(br.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    //  得到运动员的最后得分
    public float lastFen() {
        float allFen = 0;
        int minIndex = this.getLowFenIndex();
        int maxIndex = this.getHignFenIndex();
        for (int i = 0; i < fens.length; i++) {
            if (i != minIndex && i != maxIndex) {
                //  累加
                allFen += fens[i];
            }
        }
        return allFen / (fens.length - 2);
    }

    //  去掉最低分
    public int getLowFenIndex() {
        //  选择法，认为第一个元素就是最低分
        float minFen = fens[0];
        int minFenIndex = 0;
        for (int i = 1; i < fens.length; i++) {
            if (minFen > fens[i]) {
                minFen = fens[i];
                minFenIndex = i;
            }
        }
        return minFenIndex;
    }

    //  去掉最高分
    public int getHignFenIndex() {
        //  选择法，认为第一个元素就是最高分
        float maxFen = fens[0];
        int maxFenIndex = 0;
        for (int i = 1; i < fens.length; i++) {
            if (maxFen < fens[i]) {
                maxFen = fens[i];
                maxFenIndex = i;
            }
        }
        return maxFenIndex;
    }

    //  得到最菜评委
    public int getWorst() {
        float lastFen = this.lastFen();
        //  假设第一个评委是最菜
        int worstIndex = 0;
        float cai = Math.abs(fens[0] - lastFen);
        float tempCai = 0f;
        for (int i = 1; i < fens.length; i++) {
            tempCai = Math.abs(fens[i] - lastFen);
            if (cai < tempCai) {
                worstIndex = i;
                cai = tempCai;
            }

        }
        return worstIndex;
    }
}
