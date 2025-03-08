package Abstract.Abs;

public class Lab186 {
    public static void main(String[] args) {
        WagonR w = new WagonR();
        w.startengine();
        w.stopengine();
        w.drive();
    }
}

abstract class Engine{
    Engine() {
    }
abstract void startengine();

void stopengine(){
System.out.println("stopengine     o");
}
}

class WagonR extends Engine{

    @Override
    void startengine() {
        System.out.println("start the engine");
    }
void drive(){
        startengine();
    System.out.println("iam driving");
        stopengine();
        System.out.println("stopengine ok");
    }
}

interface Tyre{

 //   Tyre()//  -  no constructor
}