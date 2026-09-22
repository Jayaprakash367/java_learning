package object;
public class studentData {
    public static void main(String[] args) {
        students st1=new students();
        st1.name="ram";
        st1.age=20;
        st1.rollno=101;
        st1.Dep="CSE";
        
        st1.Study();

        students st2=new students();
        st2.name="shyam";
        st2.age=21;
        st2.rollno=102;
        st2.Dep="ECE";
        st2.Study();
        st2.exam();
      }
    }
 class students {
       String name;
       int age;
       int rollno;
       String Dep;

    void Study() {
        System.out.println(name+ " " + "Student is studying");
    }
    void exam() {
        System.out.println(name+ " " + "Student is taking an exam");
    }
}
