package oop;

import org.w3c.dom.ls.LSOutput;

/**
 * TestPoint
 * date : 2020/6/7 15:21
 * 定义一个点（point）类，用来表示三维空间的点（有三个坐标），要求如下：
 * 1. 可以生成具有特定坐标的点对象
 * 2. 提供可以设置三个坐标的方法
 * 3. 提供计算该点距原点距离平方的方法
 */
public class TestPoint {
    public static void main(String[] args) {
        Point1 p=new Point1(2.0,3.0,4.0);
        Point1 p1=new Point1(0.0,0.0,0.0);
        System.out.println(p.getDistance(p1));
        // p(6.0,3.0,4.0)
        p.setX(6.0);
        //  6.0-4.0  3.0-5.0 4.0-6.0  12
        System.out.println(p.getDistance(new Point1(4.0,5.0,6.0)));
    }
}
class Point1{
    double x,y,z;
    Point1(double _x,double _y,double _z){
        x=_x;
        y=_y;
        z=_z;
    }
    void setX(double _x){
        x=_x;
    }
    double getDistance(Point1 p){
        return (x-p.x)*(x-p.x)+(y-p.y)*(y-p.y)+(z-p.z)*(z-p.z);
    }
}