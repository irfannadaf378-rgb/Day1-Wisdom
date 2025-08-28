import java.util.*;

class Day14 {

    static int atMostK(String s, int k) {
        Map<Character, Integer> freq = new HashMap<>();
        int i = 0, ans = 0;

        for (int j = 0; j < s.length(); j++) {
            freq.put(s.charAt(j), freq.getOrDefault(s.charAt(j), 0) + 1);
            while (freq.size() > k) {
                freq.put(s.charAt(i), freq.get(s.charAt(i)) - 1);
                if (freq.get(s.charAt(i)) == 0) {
                    freq.remove(s.charAt(i));
                }
                i++;
            }
            ans += j - i + 1;
        }
        return ans;
    }

    
    static int countSub(String s, int k) {
        if (k == 0 || k > s.length()) return 0;
        return atMostK(s, k) - atMostK(s, k - 1);
    }

    public static void main(String[] args) {
      
        System.out.println(countSub("pqpqs", 2));      
        
        System.out.println(countSub("abc", 5));          
    }
}
