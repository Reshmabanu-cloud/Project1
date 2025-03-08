package inheritance.hierarchialinheritance.Singleinheritance;

public class Pe {
    public static void main(String[] args) {

        Son s1 = new Son();
        System.out.println(s1.gold);
        s1.bhk2();
s1.bhk3();

        Son2 s2 = new Son2();
        System.out.println(s2.gold);
        s2.bhk4();
        s2.bhk2();
    }
}
