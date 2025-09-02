import java.util.*;

public class Day19 {
    public static int eval(String s) {
        Stack<Integer> st = new Stack<>();
        String[] arr = s.trim().split("\\s+");

        for (String x : arr) {
            if (x.equals("+") || x.equals("-") || x.equals("*") || x.equals("/")) {
                int n2 = st.pop();
                int n1 = st.pop();
                int res = 0;
                switch (x) {
                    case "+": res = n1 + n2; break;
                    case "-": res = n1 - n2; break;
                    case "*": res = n1 * n2; break;
                    case "/": res = n1 / n2; break;
                }
                st.push(res);
            } else {
                st.push(Integer.parseInt(x));
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        System.out.println(eval("2 1 + 3 *"));
        System.out.println(eval("5 6 +"));
        System.out.println(eval("-5 6 -"));
        System.out.println(eval("15 7 1 1 + - / 3 * 2 1 1 + + -"));
        System.out.println(eval("5"));
    }
}
