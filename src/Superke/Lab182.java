package Superke;

public class Lab182 {
    public static void main(String[] args) {
Car c = new Car(5);
//c.display();
//c.message(10);
//int a = c.message(5);
        //System.out.println(a);
c.message();

    }


}

class Vehicles{

    public  int maxspeed = 190;


    void notest(){

    }

    ////Vehicles(){
       // System.out.println("default constructor" );
   // }

    Vehicles(int a){
        System.out.println("parameterized constructor");
    }

    void message(){
        System.out.println("no return type, no argument");
    }

    int message(int a ){
        System.out.println("aregument one");
        return a;
    }

    void display(){
        System.out.println("parent display");
    }
}


class Car extends Vehicles {

    private int maxspeed = 192;

   // Car() {
     //   super();
   // }

    void test() {

    }

    Car(int a) {
        super(6);
        //super(8);
        System.out.println("parameterized constructor of car");

    }

    @Override
    void display() {
        System.out.println("override display method");
        super.message();
        super.message();
        System.out.println(super.maxspeed);
        System.out.println(this.maxspeed);
        super.message(5);
        //System.out.println(this.);



    }
}
