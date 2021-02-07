package base;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author jiaong
 * @date 2017年11月15日
 * 功能：比较二个数的大小
 */
public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			//输入流，从键盘接收
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br =new BufferedReader(isr);
			//输入第一个数
			System.out.println("请输入第一个数！");
			//从控制台读取一行数据
			String a1=br.readLine();

			System.out.println("请输入第二个数！");
			String a2=br.readLine();

			//String->float
			float num1=Float.parseFloat(a1);
			float num2=Float.parseFloat(a2);

			if(num1>num2){
				System.out.println(num1);
			}else if(num1==num2){
				System.out.println(num1 +" = " +num2);
			}else{
				System.out.println(num2);
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
