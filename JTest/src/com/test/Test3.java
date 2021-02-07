package com.test;
import java.io.*;
/**
 *  演示异常
 *  在异常的地方，就会终止执行代码
 * @author jiaong
 * @date 2018/4/2 16:58
 */
public class Test3 {

    public static void main(String[] args) {
        //  检查异常,1打开文件
        FileReader fr=null;
        try {
             fr=new FileReader("D:\\aa.txt");
        }catch (Exception e){
            //  输出异常信息
            e.printStackTrace();
            //  e.getMessage();
            //  处理
        }finally {
            //  不管有没有异常，都会执行
            if(fr!=null){
                try {
                    fr.close();
                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        }

        //  2.连接一个192.168.12.12 ip的端口号为4567
        //    Socket s=new Socket("192.168.12.12",78);

        //  运行异常
        //  int a=4/0;
        //  数组越界
        //  int arr[]={1,2,3};
        //  System.out.println(arr[234]);

        //  错误异常


    }
}
