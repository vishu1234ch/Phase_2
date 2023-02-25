public class Loops {

    /********************* if else block**********************/

    int Passingmarks=100;

    public static void main(String args[])throws Exception{

        Loops obj=new Loops();

        //obj.Student_grade(200);
        //obj.DemoforLoop(50);
        //obj.DemoWhileLoop(50);
        obj.DemoReverseforLoop(15);
    }

    public  void Student_grade(int marks){
        if(marks>Passingmarks)
        {
            System.out.println("congrats you passed the exam");

        }
        else if(marks==Passingmarks)
        {
        System.out.println("you just passed the exam");
        }
            else
        {
            System.out.println("sorry you missed it");
        }
    }

    /********************* for loop **********************/

    public void DemoforLoop(int maxmarks)
    {
   for(int i=1;i<=maxmarks;i++)
   {
       System.out.println(i);
   }
    }

/********************* while loop **********************/

public void DemoWhileLoop(int a){
    //int a=50;
    while(a>1){
        System.out.println(a);
        a--;
    }

}

    /********************* Reverse for loop**********************/
    public void DemoReverseforLoop(int maxmarks)
    {
        for(int i=maxmarks; i>0; i--)
        {
            System.out.println(i);
        }
    }
}
