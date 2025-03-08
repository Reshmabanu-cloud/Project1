package polymorphism.methodoverload.methodoverride;

public class Pex {

    public static void main(String[] args) {
        Father f = new Father();
        f.f1();
        f.home();
       int m1= f.mult(6,4,4,7);
        System.out.println(m1);

        Son s = new Son();
        s.home();
        int m = s.mult(5,7,9,8);
        System.out.println(m);


       Father f2 = new Son(); // dynamic dispatch
        f2.home();
    }

}
