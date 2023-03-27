package RecursiveAndTreeAndGraph;

public class 이진수출력_재귀 {
    public void DFS(int n) {
        if(n==0) {
            return;
        }
        else {
            System.out.println(n%2+" ");
            DFS(n/2);
        }
    }

    public static void main(String[] args) {
        이진수출력_재귀 T = new 이진수출력_재귀();
        T.DFS(11);
    }
}
