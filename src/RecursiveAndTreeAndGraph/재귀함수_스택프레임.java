package RecursiveAndTreeAndGraph;

public class 재귀함수_스택프레임 {
    public void DFS(int n) {
        if(n == 0) return;
        else {
            DFS(n-1);
            System.out.println(n + " ");
        }
    }

    public static void main(String[] args) {
        재귀함수_스택프레임 T = new 재귀함수_스택프레임();
        T.DFS(3);
    }
}
