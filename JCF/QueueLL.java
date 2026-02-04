package JCF;
import java.util.*;

public class QueueLL {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(11); // offer is used to add elements: difference is that it returns false if addition fails
        queue.offer(22);
        queue.offer(33);
        queue.offer(44);
        System.out.println("Queue: " + queue);
        System.out.println("Head element: " + queue.peek());
        System.out.println("Removed element: " + queue.poll()); // removes head
        System.out.println("Queue after removal: " + queue);
    }
}
