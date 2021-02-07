package oop;

import org.w3c.dom.ls.LSOutput;

/**
 * TestGouZao 构造函数
 * date : 2020/5/20 20:09:15
 */
public class TestGouZao {
    int id;
    int age=20;

    public static void main(String[] args) {
        TestGouZao tgz=new TestGouZao(1,25);
        Point p=new Point();
        System.out.println();
    }

    public TestGouZao(int id,int age){
        id=id;
        age=age;
        System.out.println("构造方法！");
    }
}
class Point{
    public Point(){}
    int x;
    int y;

}