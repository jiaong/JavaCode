package oop;

public class Demo1 {
    public static void main(String[] args){
       Person p=new Person();
       p.speak();
       p.jiSuan();
       p.jiSuan(100);
       p.add(10,12);
       System.out.println(p.add1(10,10));
    }
}

class Person{

        public void speak(){
            System.out.println("I'm  good man!");
        }

        public void jiSuan(){
            int result=0;
            for(int i=1;i<=1000;i++){
                result+=i;
            }
            System.out.println(result);
        }

        public void jiSuan(int n){
            int result=0;
            for(int i=1;i<=n;i++){
                result+=i;
            }
            System.out.println(result);
        }
        public void add(int num1,int num2){
            int sum;
            sum=num1+num2;
            System.out.println(sum);
        }
         public int add1(int num1,int num2){
            return num1+num2;
        }
}
