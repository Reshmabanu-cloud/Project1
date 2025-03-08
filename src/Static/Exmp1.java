package Static;

public class Exmp1 {
    public static void main(String[] args) {


        Student s = new Student(20);
       int a=  s.age;
      String c =   s.course_name;
      Student s2 = new Student(82);
        System.out.println(s2.age);
        Student.m1();
    }
}

class Student{

    int age;
    String course_name;

    public Student(int age_c){
        System.out.println(this.age= age_c);
    }
 static void m1(){
     System.out.println("iam static");
 }
}
