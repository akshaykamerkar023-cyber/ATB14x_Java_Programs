package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab232_Nested_ArrayList {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        List fruits2 = null;
        fruits2.add("Orange");
        fruits2.add("apple");
        fruits2.add("Cherry");

        System.out.println(fruits2);

        fruits2 = new ArrayList<String>();
        fruits2.add("Orange");
        fruits2.add("apple");
        fruits2.add("Cherry");
        System.out.println(fruits2);

        List vegetables = new ArrayList();
        vegetables.add("Tomatto");
        vegetables.add("Onion");
        vegetables.add("Potato");
        System.out.println(vegetables);

        List all_vegetables = new ArrayList();
        all_vegetables.add("Fruits1");
        all_vegetables.add("Fruits2");
        all_vegetables.add("Fruits3");
        System.out.println(all_vegetables);

        System.out.println(all_vegetables);
        System.out.println(all_vegetables);
        System.out.println(all_vegetables);


    }
}
