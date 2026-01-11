package ex_30_Collection_Framework;

import java.util.Vector;

public class Lab229_Vector {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Akky");
        v.add("Sayu");
        v.add("Akky");
        v.add("Sayu");
        System.out.println(v);
        v.remove("Akky");
        System.out.println(v);
        System.out.println(v.contains("Akky"));
    }
}
