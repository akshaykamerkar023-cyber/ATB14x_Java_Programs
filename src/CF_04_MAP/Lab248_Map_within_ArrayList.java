package CF_04_MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab248_Map_within_ArrayList {
    public static void main(String[] args) {
        HashMap<String, String> student1 = new HashMap();
        student1.put("name", "Akky");
        student1.put("roll", "1");
        student1.put("Phone No", "7977193840");
        student1.put("Surname", "Kamerkar");
        System.out.println(student1);

        HashMap<String, String> student2 = new HashMap();
        student2.put("name", "Sayu");
        student2.put("roll", "2");
        student2.put("Phone No", "7977193840");
        System.out.println(student2);

        List students = new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);
    }
}
