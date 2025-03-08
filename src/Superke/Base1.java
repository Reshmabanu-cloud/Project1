package Superke;

class Base1 {
    public static void main(String[] args) {
        Base.Testcase1 t = new Base.Testcase1("chrome");
        t.getBrowser();
        System.out.println(t.getBrowser());

        Base.Testcase1 t2 = new Base.Testcase1("edge");
        t2.getBrowser();
        System.out.println(t2.getBrowser());
    }
}
