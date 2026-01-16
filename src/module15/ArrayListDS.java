package src.module15;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDS {
    public static void main(String[] args) {
        
        // Create ArrayList_________________________
        
        ArrayList<String> myStrs = new ArrayList<>();
        ArrayList<Integer> myNums = new ArrayList<>();
        



        // Add Elements_________________________
        
        myStrs.add("World");
        myStrs.add("!");
        myStrs.add(0,"Hello");

        myNums.add(3);
        myNums.add(1);
        myNums.add(4);
        myNums.add(2);

        System.out.println(myStrs);
        System.out.println(myNums);
        
        
        

        // Access the Elements and Size_________________________
        
        for (int i = 0; i < myStrs.size(); i++) {
            System.out.println(myStrs.get(i));
        }

        for(int num: myNums) {
            System.out.println(num);
        }




        // Change an Element_________________________

        myStrs.set(2, "Changed");
        System.out.println(myStrs);




        // Remove an Element_________________________
        
        myStrs.remove(2);
        System.out.println(myStrs);

        myStrs.clear();
        System.out.println(myStrs);
        



        // Sort an ArrayList_________________________

        Collections.sort(myNums);
        System.out.println(myStrs);
    }
}