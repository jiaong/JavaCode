package oop;

public class StaticDemo {
    static  int i=1;
    static {
        //  静态区域块一创建就会执行，但最终只执行一次。
        System.out.println("a");
        i++;
    }
    public StaticDemo(){
        System.out.println("b");
        i++;
    }
    public static void main(String[] args){
        StaticDemo d1=new StaticDemo();
        System.out.println(d1.i);
        StaticDemo d2=new StaticDemo();
        System.out.println(d2.i);
    }
}
