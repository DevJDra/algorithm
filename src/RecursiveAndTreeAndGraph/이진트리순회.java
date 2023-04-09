package RecursiveAndTreeAndGraph;

class Node {
    int data;
    Node lt, rt;
    public Node(int val) {
        data = val;
        lt = rt = null;
    }
}
public class 이진트리순회 {
    Node root;
    public void DFS(Node root) {
        if(root == null) return;
        else {
//            System.out.println(root.data + " "); 전위
            DFS(root.lt);
//            System.out.println(root.data + " "); 중위
            DFS(root.rt);
//            System.out.println(root.data + " "); 후위
        }
    }

    public static void main(String[] args) {
        이진트리순회 tree = new 이진트리순회();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
    }
}
