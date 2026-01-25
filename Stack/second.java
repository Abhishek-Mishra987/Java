package Stack;

import java.util.Stack;

public class second {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(8);
        st.push(15);
        st.push(11);
        st.push(2);

        sort(st);
        while(!st.isEmpty()){
            System.out.println(st.pop());
        }
    }

    private static void sort(Stack<Integer> st) {
        Stack<Integer> st2 = new Stack<>();
        while(!st.empty()){
            int n = st.pop();
            while(!st2.empty() && st2.peek()>n){
                st.push(st2.pop());
            }
            st2.push(n);
        }
        while(!st2.empty()){
            st.push(st2.pop());
        }
    }
}
