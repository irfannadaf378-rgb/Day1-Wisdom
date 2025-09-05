
import java.util.*;
class Day22 {
    public static int firstElementKTimes(int[] arr, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (freq.get(num) == k) {
                return num;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 4, 4, 5, 2, 6, 1, 4};
        int k = 2;
        System.out.println(firstElementKTimes(arr, k)); 
    }
}
