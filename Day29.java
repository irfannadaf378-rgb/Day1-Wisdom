import java.math.*;

public class Day29 {
    public static BigInteger fibonacci(int n) {
        if (n == 0) return BigInteger.ZERO;
        if (n == 1) return BigInteger.ONE;
        
        BigInteger a = BigInteger.ZERO;
        BigInteger b = BigInteger.ONE;
        
        for (int i = 2; i <= n; i++) {
            BigInteger c = a.add(b);
            a = b;
            b = c;
        }
        
        return b;
    }
    
    public static void main(String[] args) {
        System.out.println(fibonacci(5));   
    }
}
