package Static;

public class IIb {
    public static void main(String[] args) {
        ATB1.assignment();
        System.out.println(ATB1.cours_eName);
        ATB1 a = new ATB1();
        a.getName();
a.setName("Active");
        System.out.println(a.getName());
    }
}

class ATB1{
    {
        System.out.println("IIB - this is called when Object is created!");
        // What is the purpose? -
        // Here you can write code related to
        // start a website or anything before starting the
        // web automation or api automation
        //
    }
    private String name; // non static
    private String phone;
    static String cours_eName = "ATB10x";
    static {
        System.out.println("Load the class?, I will execute");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


void readdocument(){
    System.out.println("Non Static Method");
    System.out.println(cours_eName);
}

static void assignment(){
    //System.out.println(phone); // Staic method can't access the non static variables
    System.out.println("Do Assignment");
}



}