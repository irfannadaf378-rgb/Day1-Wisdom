import java.util.*;

public class Day27 {
    public static int shortestPath(int v, int[][] edges, int s, int e) {
        List<List<Integer>> g = new ArrayList<>();
        for (int i = 0; i < v; i++) g.add(new ArrayList<>());
        for (int[] ed : edges) {
            g.get(ed[0]).add(ed[1]);
            g.get(ed[1]).add(ed[0]);
        }
        Queue<int[]> q = new LinkedList<>();
        boolean[] vis = new boolean[v];
        q.offer(new int[]{s, 0});
        vis[s] = true;
        while (!q.isEmpty()) {
            int[] cur = q.poll();
            int u = cur[0], d = cur[1];
            if (u == e) return d;
            for (int nei : g.get(u)) {
                if (!vis[nei]) {
                    vis[nei] = true;
                    q.offer(new int[]{nei, d + 1});
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int ed = sc.nextInt();
        int[][] edges = new int[ed][2];
        for (int i = 0; i < ed; i++) {
            edges[i][0] = sc.nextInt();
            edges[i][1] = sc.nextInt();
        }
        int s = sc.nextInt(), e = sc.nextInt();
        System.out.println(shortestPath(v, edges, s, e));
    }
}
