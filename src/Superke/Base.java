package Superke;

class Base {
    private String browser;

    public Base(String browser){
        this.browser = browser;

    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isadmin) {
        if(isadmin){
            this.browser = browser;
        }else{
            System.out.println("not allowed to change");
        }


    }

    void openbrowser(){
        System.out.println("open the browser");
    }

    void openbrowser(String browsername){
        System.out.println("open browser - : " + browsername);
    }

    void closebrowser(){
        System.out.println("close browser");
    }

     static class Testcase1 extends Base{

        @Override
        public void setBrowser(String browser, boolean isadmin) {
            super.setBrowser(browser, isadmin);
            System.out.println("override the set of parent class");
        }

        public Testcase1(String browser){
            super(browser); // call the parent constructor

        }
    }
}
