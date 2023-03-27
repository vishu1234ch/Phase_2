package Basic_Java_Concepts;

public class DemoArray {
    public static void main(String args[]) throws Exception {


        Learn_Int_Type_Array();
        Learn_String_Type_Array();


    }

        public static void Learn_Int_Type_Array() {
            //Array Declaration

            int num[] = {10, 20, 30, 40, 50, 60, 70, 80};

            int array_length = num.length;
            for (int i = 0; i <= array_length; i++) {

                System.out.println(i);
            }
        }

            public static void Learn_String_Type_Array()
            {
                //Array Declaration

                String bankname[]=new String [4];


                bankname[0] = "jpmcBank";
                bankname[1] ="SBI";
                bankname[2] ="HDFC";
                bankname[3]="PNB";
                for(int a=0; a<bankname.length;a++)
                {
                    System.out.println(bankname[a]);
                }
        }
    }

