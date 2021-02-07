package oop;
//  抽象类，抽象方法
abstract class AbstractC {
    String name;
    int age;
    abstract public  void cry();
}
class Pig extends AbstractC{
    public void cry(){

    }
}