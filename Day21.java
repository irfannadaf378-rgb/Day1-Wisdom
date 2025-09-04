import java.util.Stack;

public class Main {
    static void insertBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int t = st.pop();
        insertBottom(st, x);
        st.push(t);
    }

    static void rev(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int t = st.pop();
        rev(st);
        insertBottom(st, t);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        rev(s);
        System.out.println(s); 
    }
}
