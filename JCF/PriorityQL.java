package JCF;

import java.util.Queue;
import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQL {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(30);
        pq.offer(10);
        pq.offer(20);
        pq.offer(6);
        System.out.println("Priority Queue: " + pq);
        pq.poll();
        System.out.println("After poll, Priority Queue: " + pq);
        System.out.println("Head element: " + pq.peek());


        //PriorityQueue does NOT maintain sorted order when printed.
        // It only guarantees that the head is the smallest element.(by default)
        // To see sorted order, we can poll elements one by one.
        // For implementing max-heap:
        // Queue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());


    }
}
