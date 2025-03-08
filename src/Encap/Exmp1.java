package Encap;

public class Exmp1 {

    public static void main(String[] args) {

Icci ic = new Icci("pramod",1000);
        System.out.println(ic.getBalance());
boolean iscashier  = true;
ic.setBalance(400000, iscashier);
        System.out.println(ic.getBalance());
        System.out.println(ic.bank_name);


    }
}

//## Encapsulation
//- Encapsulation is a fundamental concept in object-oriented programming (OOP).
//- Bundling of data and methods that operate on that data within a single unit.
//- Data members should be private in nature.
//- Methods with getter and setter only, you can access the data members / attributes.
class Icci{

    private String name;
    private  long balance;
    public  String bank_name = "icic";

    public Icci(String name, long balance){

        this.name= name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean iscashier) {
        if(iscashier){
        this.balance = balance;
    }else {
        System.out.println("not allowed");
    }

}
}