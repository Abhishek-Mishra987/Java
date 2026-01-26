package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class reverseq {

    public static void reverse(Queue<Integer>queue) {
        Stack <Integer> st = new Stack<>();

        // while(!queue.isEmpty()){
        //     int x = queue.poll();
        //     st.push(x);
        // }
        // while(!st.empty()){
        //     int x = st.pop();
        //     queue.add(x);
        // }

        if(!queue.isEmpty()){
            return;
        }
        while(!st.empty()){
            int x = st.pop();
            queue.add(x);
        }
    }

    public static void main(String[] args) {
        Queue<Integer>queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverse(queue);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
