package polymorphism.methodoverload.methodoverride;

public class Realexmp {
    public static void main(String[] args) {

        Commoncl c = new Commoncl();
      c.openbrowser();

      Tc c1 = new Tc();
    c1.start();
    c1.openbrowser();

    Tcc c2 = new Tcc();
    c2.openbrowser();

    }
}
        class Commoncl {
            void openbrowser() {
                System.out.println("open browser in 5 sec");
            }
        }
class Tc extends Commoncl{
                void start(){
                    System.out.println("good to start");
                }
}

class  Tcc extends Commoncl{
                @Override
    void openbrowser(){
                    System.out.println("open within fractions");
                }

}


