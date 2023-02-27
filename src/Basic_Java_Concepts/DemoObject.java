package Basic_Java_Concepts;

public class DemoObject {

    int  a=10;
    String b="varsha";

    public static void main(String args[]){
        DemoObject obj=new DemoObject(); /*-----------------object creation-----------------------------------*/
        obj.EmployeeInfo();

    }

    public  void EmployeeInfo(){
        System.out.println("Employee Details are "+ a + b);
    }

}
