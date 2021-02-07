package oop;

public class Demo3{
    public static void main(String[] args){
        Dog dog=new Dog(3,"Tom");
        Person1 p1=new Person1(dog,24,"lisi");
        Person1 p2=new Person1(dog,22,"liuqian");
        p1.showInfo();
        p1.dog.showInfo();
        p2.dog.showInfo();
    }
}
class Person1{
    int age;
    String name;
    Dog dog;
    public Person1(Dog dog,int age,String name){
        //  可读性不好 age=age
        this.age=age;
        this.name=name;
        this.dog=dog;
    }
    public void  showInfo(){
        System.out.println("name: "+this.name);
    }

}
class Dog{
    int age;
    String name;

    public Dog(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void showInfo(){
        System.out.println("Dog:"+this.name);
    }
}
