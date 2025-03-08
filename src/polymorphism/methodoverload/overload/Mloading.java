package polymorphism.methodoverload.overload;

import Accessmodifier.police.police.Cop;

public class Mloading {
    public static void main(String[] args) {


        Mathoper m1 = new Mathoper();
        int r = m1.add(2,3);
        System.out.println(r);

        int r1 = m1.add(2,8,9);
        System.out.println(r1);

        int r2 = m1.add(2,10,12,2);
        System.out.println(r2);



    }

}