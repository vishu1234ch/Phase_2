public class Method_Overloading {

    public static void main(String args[])throws Exception{

        Method_Overloading obj =new Method_Overloading();
        obj.Addition(10,20);

        obj.Addition();
        obj.Addition(10,10,10);
       
    }

    private void Addition(int a, int b) {

        int add=a+b;

        System.out.println(add);
    }
    private void Addition() {

    }
    private void Addition(int a, int b,int c ) {


        int add=a+b+c;
        System.out.println(add);
    }
}
