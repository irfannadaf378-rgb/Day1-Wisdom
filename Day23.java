import java.util.*;

class Day23 {
    public static List<Integer> ssswm(int[] arr, int k) {
        Deque<Integer> q = new ArrayDeque<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!q.isEmpty() && q.peekFirst() == i - k) q.pollFirst();
            while (!q.isEmpty() && arr[q.peekLast()] < arr[i]) q.pollLast();
            q.offerLast(i);
            if (i >= k - 1) res.add(arr[q.peekFirst()]);
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(ssswm(new int[]{1,3,-1,-3,5,3,6,7}, 3));
       
    }
}
