package ex_30_Collection_Framework;

import java.util.Stack;

public class Lab238_Stack {
    public static void main(String[] args) {
        Stack s1 = new Stack();

        Stack s2 = new Stack();
        s1.add("Akky");
        s1.add("Babu");
        s1.add("Abhya");

        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println(s1);
        System.out.println(s1.peek());
        System.out.println(s1);

        System.out.println(s1.pop());
        System.out.println(s1);

        System.out.println(s1.add("Akky"));
        System.out.println(s1);
        s1.add("Akky");
        s1.add("Babu");
        s1.push("Vija");
        System.out.println(s1);

        System.out.println(s1.get(0));
        System.out.println(s1.get(1));
    }
}
