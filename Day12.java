import java.util.*;

class Day12 {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        Map<Character, Character> m = new HashMap<>();
        m.put(')', '(');
        m.put('}', '{');
        m.put(']', '[');

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty() || st.peek() != m.get(c)) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));    
    }
}
