//Arrsy example
package arrays;

import java.util.Scanner;

public class Arrays {

    public static void main(String[] args) {
        String[] foods = new String[3];
        
        foods[0] = "Cake";
        foods[1] = "Rice";
        foods[2] = "Pizza";
        
        for(int x=0;x<foods.length;x++){
            System.out.println(foods[x]);
        }
        for(String s:foods){
            System.out.println(s);
        }
        
        int[] numbers={1,2,3,4,5};
        System.out.println(numbers.length);
        System.out.println();
        
        for(int i:numbers){
            System.out.println(i);
        }
        System.out.println();
        
        //2D Array
        
        int[][] nums={{1,2,3},{4,5,6},{7,8,9}};
        for(int x=0;x<nums.length;x++){
            //System.out.println();
            for(int y=0;y<nums[x].length;y++){
                System.out.println(nums[x][y]+"\t");
            }
        }

    }

}
