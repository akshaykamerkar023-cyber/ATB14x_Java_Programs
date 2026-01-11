package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab237_AL_iteration {
    public static void main(String[] args) {
        List<String> mylist = new ArrayList();
        mylist.add("Akky");
        mylist.add("Anil");
        mylist.add("Kamerkar");

        System.out.println(" - To print Arraylist -1");

        for (String s : mylist) {
            System.out.println(s);
        }

        System.out.println(" - To print Arraylist -2");

        // Iterator
        Iterator<String> iterator = mylist.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println(" - To Print Arraylist - 3 ");

        for (int i = 0; i < mylist.size(); i++) {
            System.out.println(mylist.get(i));
        }
    }
}
