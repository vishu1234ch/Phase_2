public class Argument_Constructor {

    int EID=10;
    String Ename;

    public Argument_Constructor(int employeeid, String Employeename){
        this.EID= employeeid;
        this.Ename=Employeename;

    }
    public  void Employeeinfo(){
        System.out.println("id=="+EID);
        System.out.println("Employename=="+Ename);
    }

    public static void main(String args[]){
        Argument_Constructor obj =new Argument_Constructor(10,"varsha");
        obj.Employeeinfo();

    }
}
