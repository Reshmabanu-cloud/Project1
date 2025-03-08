package Superke;

public class Lab181 {

    public static void main(String[] args) {
        Son s = new Son();
        s.t1();
     int gold =   s.gold;
        System.out.println(gold);


    }
}
class Father {
    Father() {
        System.out.println("DC Father");
    }

    int gold = 10;

    void home() {
        System.out.println("Home Father");
    }
}

class Son extends Father {

    Son() {
        super();
    }

    void t1() {
        super.home();

        System.out.println(super.gold);
        super.home();
    }


}


