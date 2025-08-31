import java.util.*;

public class Day17 {
    public static List<Integer> primeFactors(int n) {
        List<Integer> res = new ArrayList<>();
              int i = 3;
        while (n % 2 == 0) {
            res.add(2);
            n /= 2;
        }
  
        while (i * i <= n) {
            while (n % i == 0) {
                res.add(i);
                n /= i;
            }
            i += 2;
        }

        if (n > 1) {
            res.add(n);
        }

        return res;
    }
    public static void main(String[] args) {
        System.out.println(primeFactors(18));
    }
}
