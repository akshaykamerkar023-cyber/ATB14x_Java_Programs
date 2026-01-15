package CF_03_QUEUE;

import java.util.PriorityQueue;

public class Lab243_Queue {
    public static void main(String[] args) {
        PriorityQueue k = new PriorityQueue();
        k.add("Akky");
        k.add("King");
        k.add("Kgf");
        System.out.println(k);

        System.out.println(k.peek());
        System.out.println(k);
        System.out.println(k.poll());
        System.out.println(k);
    }

}
