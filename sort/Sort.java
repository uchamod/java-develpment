
package sort;


public class Sort {

    
    public static void main(String[] args) {
        int[] array={6,7,8,9,1,3,5,4,2};
        insertionsort(array);
        for(int n:array){
            System.out.print(n+" ");
        }
    }
  //bubble sort method.
    private static void bubblesort(int[] array) {
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    
   private static void insertionsort(int array[]){
        for(int i=1;i<array.length;i++){
            int temp=array[i];
            int j=i-1;
            try{
                while(temp<array[j] && j>=0){
                array[j+1]=array[j];
                j--;
            }
            }catch(Exception e){
                    System.out.println("error"+e);
                    }
             array[j+1]=temp;
            }
          
           
        }  
    }
    

