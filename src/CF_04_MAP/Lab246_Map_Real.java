package CF_04_MAP;

import java.util.*;

public class Lab246_Map_Real {
    public static void main(String[] args) {
        Map<String,Object> student1 = new HashMap<>();
        student1.put(String.valueOf(Integer.valueOf("name")),"Akky");
        student1.put(String.valueOf(Integer.valueOf("phone")),"7977193840");
        student1.put(String.valueOf(Integer.valueOf("address")),"BLR");
        student1.put(String.valueOf(Integer.valueOf("home_address")),"BTM");

        System.out.println(student1);
        Map<Integer,String> student2 = new LinkedHashMap<>();
        student2.put(Integer.valueOf("name"),"Diksha");
        student2.put(Integer.valueOf("address"),"DEL");
        student2.put(Integer.valueOf("address"),"DEL");
        student2.put(Integer.valueOf("home_address"),"RG");
        System.out.println(student2);

        Set book_read_items = new LinkedHashSet<>();
        book_read_items.addAll(Collections.singleton("Rich dad and Poor Dad"));
        book_read_items.add("Sapaines");
        book_read_items.add("Banana");
        book_read_items.add("Automaic Habit");
        book_read_items.add("Atomic Habit");
        book_read_items.add("Eat the frog");

    }
}
