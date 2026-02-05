package JCF;

import java.util.ArrayDeque;

public class ArrayDequeL {
    public static void main(String[] args) {
        
    ArrayDeque<Integer> dq = new ArrayDeque<>();
    dq.offer(23);
    dq.offer(45);
    dq.offerFirst(12);
    dq.offerLast(48);
    System.out.println("ArrayDeque: " + dq);
    System.out.println("First element: " + dq.peekFirst());
    System.out.println("Last element: " + dq.peekLast());
    System.out.println("Poll first: " + dq.pollFirst());
    System.out.println("After pollFirst, ArrayDeque: " + dq);
    System.out.println("Poll last: " + dq.pollLast());
    System.out.println("After pollLast, ArrayDeque: " + dq);    
    }

}
