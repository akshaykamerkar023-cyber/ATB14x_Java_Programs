package CF_04_MAP;

import java.util.HashMap;

public class Lab245_Map_P2 {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("id", 1);
        map.put("name", 2);
        map.put("id2", 100);
        map.put("id3", null);
        map.put(null, 102);
        System.out.println(map);

        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("id2"));
        System.out.println(map.containsValue(99));

        System.out.println(map.keySet());
        System.out.println(map.values());

        System.out.println(map.get("id2"));


    }
}
