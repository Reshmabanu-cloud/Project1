package Abstract.Abs.Interface;

public class Lab188 {
    public static void main(String[] args) {
I3 i = new I3();
i.icm1();
i.icm2();
    }
}
 interface I1{
 void   icm1();
   void  icm2();

 }

 interface I2{
    void icm3();
 }
 class I3 implements I1{

     @Override
     public void icm1() {
         System.out.println("complete1");
     }

     @Override
     public void icm2() {
         System.out.println("complete 2");
     }

    // @Override
   //  public void icm3() {

     }

