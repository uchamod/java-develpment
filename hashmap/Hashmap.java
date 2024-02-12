package hashmap;
//hash map excuite like array but value setup as key and value.
import java.util.HashMap;

public class Hashmap {

    public static void main(String[] args) {

        HashMap<String, Integer> user = new HashMap<String, Integer>();
        //insert the data
        user.put("Chamod", 2002);
        user.put("Charlie", 2345);
        user.put("Paul", 2782);
        user.put("Dave", 3055);
        
        System.out.println(user);
        user.remove("Chamod");//remove from hashmap
        user.get("paul");//get value depend on set key
        user.clear();//clean whole hashmap

       //get hashmap size
        System.out.println( user.size());
        user.replace("Chamod", 3000);//replace value
        System.out.println(user);
        user.containsKey("Dave");//cheack key
        user.containsValue(5637);//check value
         
        for(String x : user.keySet()){
            System.out.print(x+"\t"+"    =  ");
            System.out.println(user.get(x));
        }
    }

}
