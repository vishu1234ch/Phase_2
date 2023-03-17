package Basic_Java_Concepts;

public class DemoEncapsulation {
    public int getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    private int SSN;
    private String empName;
    private int empAge;
    private int bonus;

    public int getbonus() {

        int BNS = 0;

        if(SSN == 234432555)
        {
            BNS = 100;
        }

        if(SSN == 234432556)
        {
            BNS = 80;
        }

        return BNS;

    }

    public static void main(String args[]) throws Exception {


        DemoEncapsulation obj = new DemoEncapsulation();
        obj.setEmpAge(35);
        obj.setEmpName("Ravi");
        obj.setSSN(234432556);


        System.out.println("Emp Name is ==>"+ obj.getEmpName());
        System.out.println("Emp Age is ==>"+ obj.getEmpAge());
        System.out.println("Emp SSN is ==>"+ obj.getSSN());
        System.out.println("Emp Bonus is ==>"+ obj.getbonus()+"%");

    }
}