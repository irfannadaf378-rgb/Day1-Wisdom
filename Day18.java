public class Day18 {
    public static int divCount(int n) {
        int c = 0;
        int r = (int)Math.sqrt(n);
        for (int i = 1; i <= r; i++) {
            if (n % i == 0) {
                if (i == n / i) c++;
                else c += 2;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        System.out.println(divCount(12));   
    }
}
