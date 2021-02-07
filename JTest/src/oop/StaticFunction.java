package oop;
//  静态方法，也叫类方法
//  类变量用类方法访问.普通方法，可以访问普通变量和类变量
public class StaticFunction {
    public static void main(String[] args) {
        Stu stu1=new Stu(24,"zhaoer",300);
        Stu stu2=new Stu(20,"lisi",500);
        System.out.println(Stu.getTotalFee());
    }
}
class Stu{
    int age;
    String name;
    int fee;
    static int  totalFee;
    public Stu(int age,String name,int fee){
        this.age=age;
        this.name=name;
        totalFee+=fee;
    }
    public static int getTotalFee(){
        return totalFee;
    }
}