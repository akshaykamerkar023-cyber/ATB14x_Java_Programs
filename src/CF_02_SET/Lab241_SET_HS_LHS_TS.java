package CF_02_SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Lab241_SET_HS_LHS_TS {
    public static void main(String[] args) {
        Set<String> hs = new HashSet();
        hs.add("Akky");
        hs.add("orange");
        hs.add("kela");
        hs.add("Santra");

        hs.add(null);
        System.out.println(hs);

        System.out.println("------------------------------------");
        Set lhs = new LinkedHashSet();

        lhs.add("Vada");
        lhs.add("Misal");
        lhs.add("Nhaji");
        lhs.add("Cobi");
        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("--------------------------------------");
    }
}
