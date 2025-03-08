package Encap;

public class Exmp2 {
    public static void main(String[] args) {
        Vmo v =new Vmo("abc", "1234");
        System.out.println(v.password);
        v.password="9652";
        System.out.println(v.password);

        Goodvmo vi = new Goodvmo("myuser","mypassword489");
        System.out.println(vi.getPassword());
        boolean isadmin = true;
        vi.setPassword("fgh68888",isadmin);
        vi.setUsername("ghgh");
        System.out.println(vi.getUsername());

        System.out.println(vi.getPassword());

    }
}

class Vmo{
    public String username;
    public String password;

    public Vmo(String usr, String pwd){
        this.username= usr;
        this.password= pwd;

    }
}

class Goodvmo {

    private String username;
    private String password;


    public Goodvmo(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }
        public String getUsername () {
            return username;
        }

        public void setUsername (String username){
            this.username = username;
        }

        public String getPassword () {
            return password;
        }

        public void setPassword (String password, boolean isadmin){
            if(isadmin) {
                this.password = password;
            }else{
                    System.out.println(" password not allowed");
                }
            }


        }

