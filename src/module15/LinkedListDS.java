package src.module15;

import java.util.LinkedList;
import java.util.Collections;

public class LinkedListDS {
    public static void main(String[] args) {

        // Create LinkedList_________________________
        
        LinkedList<Integer> myNums = new LinkedList<>();




        // Add Elements_________________________

        myNums.add(3);
        myNums.add(1);
        myNums.add(4);
        myNums.add(2);




        // Loop through LinkedList_________________________

        for(int num: myNums) {
            System.out.println(num);
        }




        // getFirst() and getLast()_________________________

        System.out.println(myNums.getFirst());
        System.out.println(myNums.getLast());




        // addFirst() and addLast()_________________________
        
        myNums.addFirst(6);
        myNums.addLast(5);
        System.out.println(myNums);
        
        
        
        
        // removeFirst() and removeLast()_________________________
        
        myNums.removeFirst();
        myNums.removeLast();
        System.out.println(myNums);
        
        
        
        
        // Sort LinkedList_________________________
        
        Collections.sort(myNums);
        System.out.println(myNums);
        
        Collections.sort(myNums, Collections.reverseOrder());
        System.out.println(myNums);
    }
}
