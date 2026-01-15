package CF_03_QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class LabArrayDeque {
    public static void main(String[] args) {
        Deque deck = new ArrayDeque();
        deck.push(5);
        deck.push(3);
        System.out.println(deck);
    }
}
