package oop;

public class Test {
    public static void main(String[] args) {

    }
}

interface Bird {
    public void fly();
}

interface Fish {
    public void swimming();
}

class Monkey {
    int name;

    public void jump() {
        System.out.println("猴子会跳！");
    }
}

class LittleMonkey extends Monkey implements Fish, Bird {
    public void fly() {

    }

    public void swimming() {

    }
}