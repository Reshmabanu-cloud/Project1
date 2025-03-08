package Abstract.Abs;

public class Lab183 {
    public static void main(String[] args) {
        child c =new child();
        c.loan50k();
        c.loan25k();
    }
}

abstract class Father{
    abstract void loan50k();
    void loan25k(){
        System.out.println("20k given" );
    }
}

class child extends Father{

    @Override
    void loan50k() {
        System.out.println(" child will pay");
    }
}
