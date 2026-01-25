package Stack;
import java.util.Iterator;
import java.util.Stack;

public class first {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);    
        st.push(20);


        // System.out.println("Stack elements: " + st);
        // System.out.println("Top element: " + st.peek());

        // System.out.println("Top element: " + st.peek());


        // By using Iterator -> for traversing the stack from bottom to top
        Iterator<Integer> it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        // By using pop() -> for traversing the stack from top to bottom

        //  while(!st.isEmpty()){
        //     System.out.println(st.pop());
        // }

        System.out.println("Position of 20 is: " + st.search(20)); // returns -1 if not found
}
}
