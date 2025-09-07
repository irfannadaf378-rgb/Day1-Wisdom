
class Node {
    int v;
    Node l, r;
    Node(int x) { v = x; }
}

class Day24 {
    public Node lca(Node root, Node p, Node q) {
        if (root == null || root == p || root == q) return root;
        Node left = lca(root.l, p, q);
        Node right = lca(root.r, p, q);
        if (left != null && right != null) return root;
        return left != null ? left : right;
    }
}

public class Main {
    public static void main(String[] args) {
        Node root = new Node(3);
        root.l = new Node(5);
        root.r = new Node(1);
        root.l.l = new Node(6);
        root.l.r = new Node(2);
        root.r.l = new Node(0);
        root.r.r = new Node(8);
        root.l.r.l = new Node(7);
        root.l.r.r = new Node(4);

        Day24 s = new Day24();
        Node p = root.l;
        Node q = root.l.r.r;
        System.out.println(s.lca(root, p, q).v);

       
    }
}
