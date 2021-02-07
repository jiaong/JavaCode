package oop;

public class PlaySnow {
//    有一群小孩在玩堆雪人，不时有新的小孩加入，请问如何知道现在共多少人在玩
    public static void main(String[] args){
    Child ch1=new Child(3,"Tom");
    ch1.joinGame();
    Child ch2=new Child(3,"lucy");
    ch2.joinGame();
    System.out.println("sum = "+ch2.total);
    }

}
class Child{
    int age;
    String name;
    static int total=0;
    public Child(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void joinGame(){
        total++;
        System.out.println(" The child join game!" );
    }
}