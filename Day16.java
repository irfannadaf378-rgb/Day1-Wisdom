

public class Day16 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

   public static long lcm(int a, int b) {
        return (long) a / gcd(a, b) * b;  
    }

    public static void main(String[] args) {
        int x = 4, y = 6;  
        System.out.println(lcm(x, y));
    }
}
