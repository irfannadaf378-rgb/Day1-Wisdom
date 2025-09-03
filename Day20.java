
import java.util.*;

public class Day20 {
    static void put(Stack<Integer> a, int b) {
        if (a.isEmpty() || a.peek() <= b) {
            a.push(b);
            return;
        }
        int c = a.pop();
        put(a, b);
        a.push(c);
    }

    static void sort(Stack<Integer> x) {
        if (x.size() <= 1) return;
        int y = x.pop();
        sort(x);
        put(x, y);
    }

    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>();
        s1.push(3); s1.push(1); s1.push(4); s1.push(2);
        sort(s1);
        System.out.println(s1);

        Stack<Integer> s2 = new Stack<>();
        s2.push(7); s2.push(1); s2.push(5);
        sort(s2);
        System.out.println(s2);

        Stack<Integer> s3 = new Stack<>();
        s3.push(5);
        sort(s3);
        System.out.println(s3);

        
    }
}
