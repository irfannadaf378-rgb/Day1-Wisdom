class Node {
    int v;
    Node l, r;
    Node(int x) { v = x; }
}

class Day25 {
    public boolean isBST(Node root) {
        return chk(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean chk(Node n, long low, long high) {
        if (n == null) return true;
        if (n.v <= low || n.v >= high) return false;
        return chk(n.l, low, n.v) && chk(n.r, n.v, high);
    }
}

public class Main {
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.l = new Node(1);
        root1.r = new Node(3);
        System.out.println(new Day25().isBST(root1));
      
    }
}
