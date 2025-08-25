

import java.util.*;

public class Perm {
    public static List<String> perm(String s) {
        List<String> ans = new ArrayList<>();
        char[] a = s.toCharArray();
        Arrays.sort(a);
        boolean[] u = new boolean[a.length];
        back(ans, new StringBuilder(), a, u);
        return ans;
    }

    private static void back(List<String> ans, StringBuilder p, char[] a, boolean[] u) {
        if (p.length() == a.length) {
            ans.add(p.toString());
            return;
        }
        for (int i = 0; i < a.length; i++) {
            if (u[i]) continue;
            if (i > 0 && a[i] == a[i-1] && !u[i-1]) continue;
            u[i] = true;
            p.append(a[i]);
            back(ans, p, a, u);
            p.deleteCharAt(p.length() - 1);
            u[i] = false;
        }
    }

    public static void main(String[] args) {
        System.out.println(perm("abc")); 
    }
}
