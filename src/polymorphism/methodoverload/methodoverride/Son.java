package polymorphism.methodoverload.methodoverride;

public class Son extends Father{
    @Override

    void home(){
        System.out.println("bhk 5");
    }
    void p1(){
        System.out.println("son p1");
    }

   @Override

   int  mult(int a,int b, int c,int d){
       return  a*b*c;


    }
}
