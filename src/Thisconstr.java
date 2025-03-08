public class Thisconstr {

        public static void main(String[] args) {



            Mobile1 iphone16= new Mobile1("iphone new 16",  "166");
            Mobile1 iphone17 = new Mobile1("iphone new 17", "167");
            System.out.println(iphone16.mname);
            System.out.println(iphone16.version);
            System.out.println(iphone17.version);

iphone17.clarity();
            String give_me_mname =  iphone16.give_me_mname();
            System.out.println(give_me_mname);


        }

    }


        class Mobile1 {
            String mname;
            String version;

            Mobile1(String mname_i, String version_i) {
                this.mname = mname_i;
                this.version = version_i;
            }

            void clarity(){
                System.out.println(this.mname +"-"+ this.version);

            }


            String give_me_mname(){
              return this.version;
             }


        }

