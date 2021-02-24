package array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Operation {
    public static void main(String[] args) throws Exception {
        Dog dogs[] = new Dog[4];
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        for (int i = 0; i < 4; i++) {
            dogs[i] = new Dog();
            int n = i + 1;
            System.out.println("请输入第" + n + "只狗名！");
            String name = br.readLine();
            //  将名字赋值给对象
            dogs[i].setName(name);
            System.out.println("请输入第" + n + "只狗的体重！");
            String s_weight = br.readLine();
            float weight = Float.parseFloat(s_weight);
            //  将体重赋值给对象
            dogs[i].setWeight(weight);
        }
        //  计算总体重
        float allWeight = 0;
        for (int i = 0; i < 4; i++) {
            allWeight += dogs[i].getWeight();
        }
        //  计算平均值
        float avgWeight = allWeight / dogs.length;
        System.out.println("总体重：" + allWeight + " 平均体重：" + avgWeight);
        //  求最大体重的狗
        float maxWeight = dogs[0].getWeight();
        int maxIndex = 0;
        for (int i = 1; i < dogs.length; i++) {
            if (maxWeight < dogs[i].getWeight()) {
                maxWeight = dogs[i].getWeight();
                maxIndex = i;
            }
        }
        System.out.println("体重最大的狗是第" + (maxIndex + 1) + "只狗，体重是：" + dogs[maxIndex].getWeight());
    }
}

class Dog {
    private String name;
    private float weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}
