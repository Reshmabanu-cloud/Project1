package Abstract.Abs.Interface;

public class Multipleinheritance {
    public static void main(String[] args) {
        Child c = new Child();
        c.f1();
        c.money();
        c.test();
    }
}

class Child implements Father,Mother{


    @Override
    public void money() {
        System.out.println("child money");
    }

    @Override
    public void f1() {

    }

    @Override
    public void test() {
        Father.super.test();
    }
}

interface Mother{
    void money();
    void f1();
}

interface Father{
    void money();
    void f1();

    default void test(){
        System.out.println("this is allowed to test");
    }
    // only default keyword this function allowed

}