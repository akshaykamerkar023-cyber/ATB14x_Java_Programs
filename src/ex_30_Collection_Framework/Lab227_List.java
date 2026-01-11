package ex_30_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab227_List {
    public static void main(String[] args) {
        List fruits = List.of("Orange", "Apple", "Banana");
        System.out.println(fruits);

        List arryList = new ArrayList();
        arryList.add("Orange");
        arryList.add("Apple");
        arryList.add("Banana");
        arryList.add(true);
        arryList.add(1.23);
        arryList.add(123);

        System.out.println(arryList);
        System.out.println(arryList.size());
    }
}
