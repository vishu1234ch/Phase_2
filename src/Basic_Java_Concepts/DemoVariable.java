package Basic_Java_Concepts;

public class DemoVariable {

    int a= 10; /*-------variable-------Also class level variable because declared inside the class and outside the method*/
    String b = "Varsha";


    static int x=20;  /*--------Static Variable------Also class level variable because declared inside the class and outside the method--*/
    static String y="chauhan";

    public static void main (String args[]){
        DemoVariable obj= new DemoVariable();
        obj.Employeeinfo();
        obj.StudentInfo();
        obj.TeacherInfo();

    }

    public static void StudentInfo(){

        System.out.println(x+" "+y);


    }

    public void Employeeinfo(){
     int z=10; /*------------Method level variable------- because derived inside a particular method--------*/
     int y=20;

        System.out.println(y+" "+z);


    }

    public void TeacherInfo(){
        System.out.println(a+" "+b);
    }


}
