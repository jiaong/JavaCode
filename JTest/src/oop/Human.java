package oop;

//import com.sun.org.apache.xpath.internal.SourceTree;

//import java.util.SplittableRandom;

//  多态
public class Human {
    public static void main(String[] args) {
       /** Animal an=new Sleep();
        an.cry();
        an.eat();
        an=new Tiger();
        an.cry();
        an.eat();*/
       Master master=new Master();
       master.feed(new Sleep(),new Cao());
       master.feed(new Tiger(),new Rou());
    }
}
class Master{
    //  给动物喂食物,使用多态,方法可以用一个。
    public void feed(Animal an,Food fd){
        an.eat();
        fd.showName();
    }
}
class Food{
    String name;
    public void showName(){

    }
}
class Cao extends Food{
    public void showName(){
        System.out.println("草");
    }
}
class  Rou extends Food{
    @Override
    public void showName() {
        System.out.println("肉");
    }
}
class Animal{
    String name;
    int age;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public void cry(){
        System.out.println("不知道怎么叫!");
    }
    public  void eat(){
        System.out.println("不知道吃什么!");
    }
}
class Sleep extends Animal{
    public void cry(){
        System.out.println("羊叫");
    }
    public void eat(){
        System.out.println("羊吃草！");
    }
}
class Tiger extends Animal{
    public void cry(){
        System.out.println("虎叫");
    }
    public void eat(){
        System.out.println("虎吃肉！");
    }
}