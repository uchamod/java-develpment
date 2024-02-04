package arratlist;

import java.util.ArrayList;

public class Arratlist {

    public static void main(String[] args) {
        ArrayList val = new ArrayList();
        ArrayList<String> names = new ArrayList<String>();

        names.add("chamod");
        names.add("malith");
        names.add("rasindu");
        names.add("kasun");

        val.add(23);
        val.add(33);
        val.add(43);
        val.add(13);
        for (Object i : val) {
            System.out.println(i);

        }
        for (Object n : names) {
            System.out.println(n);
        }
        //2D ArryList

        ArrayList<String> Sports = new ArrayList();
        ArrayList<String> Players = new ArrayList();
        ArrayList< ArrayList<String>> team = new ArrayList();

        Sports.add("Cricket");
        Sports.add("Basketball");
        Sports.add("Football");

        Players.add("Malinga");
        Players.add("Michel");
        Players.add("Messi");
        
        team.add(Sports);
        team.add(Players);
        
        System.out.println(team);
        System.out.println(team.get(0));
        System.out.println(team.get(0).get(2));
    }
}
