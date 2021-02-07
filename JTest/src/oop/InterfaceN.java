package oop;
//  接口:interface 实现接口：implements
interface InterfaceNum{
    int a=1;
    public void start();
    public void stop();
}
//  相机
// 类实现了接口，需要把接口的所有方法全部实现
class Camera implements InterfaceNum,K{
    public void start(){
        System.out.println("相机开始工作!");
    }
    public void stop(){
        System.out.println("相机停止工作!");
    }
}
//  手机类
class Phone implements InterfaceNum{
    public void start(){
        System.out.println("手机开始工作!");
    }
    public void stop(){
        System.out.println("手机停止工作!");
    }
}
//  计算机
class Computer{
    //  开始使用usb接口
    public void  useInterfaceNum(InterfaceNum usb){
        usb.start();
        usb.stop();
    }
}
public class InterfaceN{
    public static void main(String[] args) {
        Computer computer=new Computer();
        Camera camera=new Camera();
        Phone phone=new Phone();
        computer.useInterfaceNum(camera);
        computer.useInterfaceNum(phone);
        System.out.println(InterfaceNum.a);
    }
}
interface K{

}