package typeof_lists;

import java.awt.*;
import java.util.*;

public class Typeof_lists {

  

    public static void main(String[] args) {
        LinkedList no = new LinkedList();
        
        no.add(10);
        no.add(12);
        no.add(14);
     
        no.add(1, 25);
        System.out.println(no.getLast()); 
        no.forEach(p -> {System.out.println(p);});
         

  /*  public static LinkedList<Integer> List(int i0, int i1, int i2) {
        no.add(i0);
        no.add(i1);
        no.add(i2);
        
        return no;
    }*/

   
}}
