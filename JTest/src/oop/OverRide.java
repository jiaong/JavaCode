package oop;
//  方法覆盖
public class OverRide {
    int age;
    String name;
    public void  cry(){
        System.out.println("我不知道怎么哭！");
    }
}
class Cat1 extends OverRide{
    public void cry(){
        System.out.println("猫猫！");
    }
}
