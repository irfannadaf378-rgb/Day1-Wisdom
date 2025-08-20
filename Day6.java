import java.util.*;

public class Day6 {

    public static List<int[]> findSubarrays(int[] arr) {
        List<int[]> result = new ArrayList<>();
        int prefixSum = 0;


        Map<Integer, List<Integer>> hashmap = new HashMap<>();
        hashmap.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];

            if (hashmap.containsKey(prefixSum)) {
                for (int start : hashmap.get(prefixSum)) {
                    result.add(new int[]{start + 1, i});
                }
            }

            hashmap.putIfAbsent(prefixSum, new ArrayList<>());
            hashmap.get(prefixSum).add(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 3, -1, 2};
        List<int[]> subarrays = findSubarrays(arr);

        for (int[] pair : subarrays) {
            System.out.println("(" + pair[0] + ", " + pair[1] + ")");
        }
    }
}
