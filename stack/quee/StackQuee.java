package stack.quee;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQuee {

    public static void main(String[] args) {
        /* Stack<String> stk = new Stack<String>();
        Stack<Integer> stint = new Stack<Integer>();
        stk.push("amal");
        stk.push("kmal");
        stk.push("bimal");
        stk.push("shamal");
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        stint.add(1);
        stint.add(2);
        stint.add(3);
        System.out.println(stint);*/
        Queue<String> qu = new LinkedList<String>();
        qu.offer("amal");
        qu.offer("kmal");
        qu.offer("bimal");
        System.out.println(qu);
        
        qu.poll();
        System.out.println(qu);
    }

}
