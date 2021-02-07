package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 跳水比赛，8个评委打分
 * 运动员成绩，去掉一个最高分和一个最低分
 * 剩余6个分数的平均分就是最后得分
 * 使用一位数组实现
 * 找出最高分和最低分的评委
 * 找出最菜的评委
 */
public class Dive {
    public static void main(String[] args) {
        Judge judge=new Judge();
        System.out.println("最后得分："+judge.lastFen());
        System.out.println("最高分是第" +(judge.getHignFenIndex()+1)+"个裁判！");
        System.out.println("最低分是第" +(judge.getLowFenIndex()+1)+"个裁判！");
        System.out.println("最才裁判是第" +(judge.getWorst()+1)+"个！");
    }
}
class Judge{
    // 定义一个存放8个小数数组
    float fens[]=null;
    int size=4;
    // 构造函数
    public Judge(){
        fens =new float[size];
        // 初始化
        InputStreamReader rs=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(rs);

        try {
            for (int i=0;i<fens.length;i++){
                System.out.println("请输入第"+(i+1)+"裁判打分！");
                fens[i]=Float.parseFloat(br.readLine());
            }

        } catch(Exception e){
            e.printStackTrace();

        }finally {
            try {
                br.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

    }
    // 运动员最后得分
    public float lastFen(){
        float allFen=0;
        int minIndex= this.getLowFenIndex();
        int maxIndex=this.getHignFenIndex();
        for(int i=0;i<fens.length;i++){
            if (i!=minIndex && i!=maxIndex){
                allFen+=fens[i];
            }
        }
        return allFen/(fens.length-2);
    }
    // 去掉最低分（找到最低分的下标）
    public int getLowFenIndex(){
        // 选择法,认为第一个元素就是最低分
        float minFen=fens[0];
        int minFenIndex=0;
        for (int i=1;i<fens.length;i++){
            if (minFen>fens[i]){
                minFen=fens[i];
                minFenIndex=i;
            }
        }
        return minFenIndex;
    }

    // 去掉最高分
    public int getHignFenIndex(){
        float maxFen=fens[0];
        int maxFenIndex=0;
        for (int i=1;i<fens.length;i++){
            if (maxFen<fens[i]){
                maxFen=fens[i];
                maxFenIndex=i;
            }
        }
        return maxFenIndex;
    }
    // 得到最菜的评委
    public int getWorst(){
        float lastFen=this.lastFen();
        // 假设第一个评委就是最菜
        int worstIndex=0;
        // Math.abs 取绝对值
        float cai=Math.abs(fens[0]-lastFen);
        float tempCai=0f;
        for (int i=1; i<fens.length;i++){
            tempCai =Math.abs(fens[i]-lastFen);
            if(cai<tempCai){
                worstIndex=i;
                cai=tempCai;
            }
        }
        return worstIndex;
    }
}
































