
package recursive;


public class Recursive {

    
    public static void main(String[] args) {
       
        step(5);
        System.out.println(fact(5));
        System.out.println(pow(2,6));
        
        
    }

    private static void step(int i) {
        if(i<0)return;//base case
        System.out.println("hellow");
        step(i-1);//recursive case
    }

    //find the factorial using recursive function
    private static int fact(int i) {
        if(i<1)return 1; //base
        return i*fact(i-1); //recursive
    }

    //find the power using recursive function
    private static int pow(int b,int e) {
        if(e<1)return 1; //base
        return b*pow(b,e-1); //recursive
    }
}
