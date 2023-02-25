public class Variable_Learning {
    int roll = 10;
    String bookname;
    public Variable_Learning(){

        System.out.println("this is called constructor ");
        this.bookname="C";

    }

    public static void main(String args[])throws Exception {

        Variable_Learning obj=new Variable_Learning();


        System.out.println(Add_number( 10, 20,30));

        System.out.println(Fullname( "varsha", "Chauhan"));
        System.out.println(obj.bookname);
    }

        public void Addition () {
            int id = 12;
            System.out.println(roll);
            System.out.println(id);
        }

        public void Substract () {
            System.out.println(roll);

        }
        public static int Add_number ( int a, int b, int c){
            return a + b + c;

        }
        public static String Fullname(String Fname, String Lname){

        return Fname+" "+Lname;


        }
    }

