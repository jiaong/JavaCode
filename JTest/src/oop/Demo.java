package oop;

/**
 * @author jiaong
 * @date 2017年11月17日
 */
public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat1=new Cat();
		cat1.age=3;
		cat1.name="小白";
		cat1.color="白色";
		System.out.println(cat1.age);
	}
	
}
class Cat{
	int age;
	String name;
	String color;
}