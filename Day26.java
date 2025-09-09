import java.util.*;

public class Day26 {
    public static boolean hasCycle(int n, List<int[]> edges) {
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < n; i++) g.add(new ArrayList<>());
        for (int[] e : edges) {
            g.get(e[0]).add(e[1]);
            g.get(e[1]).add(e[0]);
        }

        boolean[] vis = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                if (dfs(i, -1, vis, g)) return true;
            }
        }
        return false;
    }

    private static boolean dfs(int u, int p, boolean[] vis, List<List<Integer>> g) {
        vis[u] = true;
        for (int v : g.get(u)) {
            if (!vis[v]) {
                if (dfs(v, u, vis, g)) return true;
            } else if (v != p) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasCycle(5, Arrays.asList(
            new int[]{0,1}, new int[]{1,2}, new int[]{2,3}, new int[]{3,4}, new int[]{4,0}
        )));
        System.out.println(hasCycle(3, Arrays.asList(
            new int[]{0,1}, new int[]{1,2}
        )));
        System.out.println(hasCycle(4, Arrays.asList(
            new int[]{0,1}, new int[]{1,2}, new int[]{2,0}
        )));
        System.out.println(hasCycle(5, new ArrayList<>()));
        System.out.println(hasCycle(2, Arrays.asList(
            new int[]{0,1}, new int[]{0,1}
        )));
    }
}
