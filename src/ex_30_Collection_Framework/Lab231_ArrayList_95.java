package ex_30_Collection_Framework;

import java.util.ArrayList;

public class Lab231_ArrayList_95 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Bread");
        list.add("Milk");
        list.add("Butter");
        list.add("Panner");
        list.add("Chocolate");
        list.add("Milk");
        list.add("Butter");
        list.add("Milk");
        list.add("true");

        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains("1"));

        System.out.println(list.indexOf("3"));


    }
}
