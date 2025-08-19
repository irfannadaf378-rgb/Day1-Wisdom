import java.util.*;

public class day5 {
    public static void main(String[] args) {
        int[] arr = {16,17,4,3,5,2};
        List<Integer> ans = new ArrayList<>();

        int n = arr.length;
        int maxr = arr[n - 1];
        ans.add(maxr);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > maxr) {
                maxr = arr[i];
                ans.add(maxr);
            }
        }

        Collections.reverse(ans);
        System.out.println("Leaders: " + ans);
    }
}
