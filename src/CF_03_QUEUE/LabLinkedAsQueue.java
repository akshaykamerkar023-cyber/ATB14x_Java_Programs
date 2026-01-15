package CF_03_QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LabLinkedAsQueue {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("6");
        q.add("8");
        q.add("1");

        //System.out.println(q);
        Iterator<String> iterator = q.iterator();
        while (iterator.hasNext()) {
            Integer value = Integer.valueOf(iterator.next());
            System.out.println(value);
        }
    }
}
