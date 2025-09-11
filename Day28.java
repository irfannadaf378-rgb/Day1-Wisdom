import java.util.*;

class Node {
    int v; Node l,r;
    Node(int v){this.v=v;}
}

class Sol {
    public boolean isSym(Node root) {
        if(root==null) return true;
        return chk(root.l, root.r);
    }
    boolean chk(Node a, Node b){
        if(a==null && b==null) return true;
        if(a==null || b==null) return false;
        return a.v==b.v && chk(a.l,b.r) && chk(a.r,b.l);
    }
}

class Main {
    static Node build(Integer[] arr){
        if(arr.length==0) return null;
        Node root=new Node(arr[0]);
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(!q.isEmpty() && i<arr.length){
            Node cur=q.poll();
            if(arr[i]!=null){
                cur.l=new Node(arr[i]);
                q.add(cur.l);
            }
            i++;
            if(i<arr.length && arr[i]!=null){
                cur.r=new Node(arr[i]);
                q.add(cur.r);
            }
            i++;
        }
        return root;
    }
    public static void main(String[] args){
        Integer[][] tests={
            {1,2,2,3,4,4,3},
            {1,2,2,null,3,null,3},
            {1},
            {},
            {1,2,2,3,null,null,3}
        };
        Sol s=new Sol();
        for(Integer[] t:tests){
            Node root=build(t);
            System.out.println(s.isSym(root));
        }
    }
}
