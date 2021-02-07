package oop;

public class Qualifier {
    public static void main(String[] args) {
       Clerk clerk1=new Clerk("lisi",20,4567.8f);
        System.out.println("名字："+clerk1.name+" 工资："+clerk1.getSalary());
    }
}
class Clerk{
    public String name;
    private int age;
    private float salary;
    public Clerk(String name,int age,float salary){
        this.name=name;
        this.age=age;
        this.salary=salary;
    }
    public float getSalary(){
        return this.salary;
    }
}