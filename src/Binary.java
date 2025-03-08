import polymorphism.methodoverload.overload.Mathoper;

public class Binary {
    public static void main(String[] args) {

        int age = 659; // Decimal System - base wil 10

        // Binary Literal
        int binary_num = 0b1010; // Decimal System - 10
        System.out.println(binary_num);
        // Octal base? -> 8
        int octal = 01010;
        System.out.println(octal);

        // Hexadecimal Literals
        int hex = 0Xface;
        //base 16 color combination are in hex - #28a745

        Mathoper m1 = new Mathoper();
        int r = m1.add(2,3);
        System.out.println(r);
    }
}
