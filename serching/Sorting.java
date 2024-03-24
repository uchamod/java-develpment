
package serching;

import java.util.*;


public class Sorting {
    
   
   
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int[] array=new int[1000];
        
        for(int i=0;i<array.length;i++){
            array[i]=i+1;
            
        }
        
        System.out.print("Point a number:");
        int num=scan.nextInt();
        /*int val=Arrays.binarySearch(array,num);
        if(val>=0){
            System.out.println(num+" are available in this list:position. "+val);
        }else{
            System.out.println(num+" is not avalible here.");
        }*/
        int val=serch(array,num);
        if(val==-1)System.out.println("Element is not found");
        else System.out.println("Element is found: position number "+val);
    }

    private static int serch(int[] array, int number) {
       int low=0; 
       int high=array.length-1;
       while(low<=high){
           int mid=low+(high-low)/2;
           System.out.println("Middle value:"+mid);
           if(array[mid]>number)high=mid-1;
           else if(array[mid]<number)low=mid+1;
           else return mid;
       }
      return -1;
       
     
    }
    
}
