package sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        Set<String> names = new HashSet();
        List<String> towns = new ArrayList();
        Set<String> nums = new LinkedHashSet();

        names.add("chamod");
        names.add("james");
        names.add("benjamin");
        names.add("christoper");

        nums.add("chamod");
        nums.add("james");
        nums.add("benjamin");
        nums.add("christoper");

        towns.add("manila");
        towns.add("tokyo");
        towns.add("manila");
        towns.add("tokyo");

        System.out.println(names);
        for (String n : names) {
            System.out.println(n);
        }
        System.out.println("");
        for (String p : nums) {
            System.out.println(p);
        }
        names.clear();
        names.addAll(towns);

        System.out.println();
        for (String n : names) {
            System.out.println(n);
        }
    }

}
