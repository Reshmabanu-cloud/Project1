package Abstract.Abs.Interface;

public class Lab187 {
    public static void main(String[] args) {
Car1 c = new Car1();
c.applybrakes();
c.drive();
    }
}
 interface Engine1{
    void startengine();
void stopengine();
     default void test(){
         System.out.println("concrete complete test");
     }
 }

 interface brakes{

    void applybrakes();
        }
class Car1 implements Engine1, brakes{

    void drive(){
        startengine();
        stopengine();
        applybrakes();
    }

    @Override
    public void startengine() {
        System.out.println("start the enngine");
    }

    @Override
    public void stopengine() {
        System.out.println("stop the engine");
    }

    @Override
    public void applybrakes() {
        System.out.println("apply the brakes");
    }
}