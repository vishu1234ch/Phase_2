package Basic_Java_Concepts;

import java.util.HashMap;

public class DemoHashMap {


    public static void main(String args[]) throws Exception {

        DemoHashMap obj = new DemoHashMap();
        obj.implement_Hasmpa();


    }


    public void implement_Hasmpa() {


        HashMap<Integer, String> HM = new HashMap<Integer, String>();

        HM.put(1, "Sachin");
        HM.put(2, "Geetha");
        HM.put(3, "Pooja");
        HM.put(4, "Ravi");
        HM.put(5, "Rahul");
        HM.put(6, "Mariana");
        HM.put(7, "Vinayak");
        HM.put(8, "Mithun");
        HM.put(9, "Vidya");
        HM.put(10, "Anurag");

        System.out.println(HM.get(6));
        System.out.println(HM);

        HM.remove(10);
        System.out.println(HM);

        // How to iterate HasMap?

        for (int i : HM.keySet()) {


            System.out.println("When Key Value is==>" + i + " " + "Then its corresponding value is ==>" + HM.get(i));
        }


    }

}