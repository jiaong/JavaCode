package pack;

public class AccTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        HuMan1 lisi = new HuMan1();
        HuMan1 zs = new HuMan1();
        System.out.println(lisi.showMoney(zs));
    }
}

class HuMan1 {
    private int money = 1000;

    public int showMoney(HuMan1 who) {
        return who.money;
    }

    public void setMoney(HuMan1 who) {
        who.money -= 400;
    }
}