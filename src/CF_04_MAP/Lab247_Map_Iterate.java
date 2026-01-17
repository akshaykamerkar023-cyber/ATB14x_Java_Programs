package CF_04_MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab247_Map_Iterate {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("id", 1);
        map.put("id2", 2);
        map.put("id3", 3);
        map.put("id4", 4);
        map.put("id5", 5);
        map.put("id6", 6);
        map.put("null", 100);

        System.out.println(map);
        System.out.println(map.size());

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

    }
}
