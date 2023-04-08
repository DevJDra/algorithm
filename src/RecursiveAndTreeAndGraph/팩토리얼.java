package RecursiveAndTreeAndGraph;

import java.util.Scanner;

public class 팩토리얼 {

    public int DFS(int n) {

        if(n == 1) return 1;
        else return n*DFS(n-1);

    }

    public static void main(String args[]) {
        팩토리얼 T = new 팩토리얼();
        Scanner kb = new Scanner(System.in);
        System.out.println(T.DFS(kb.nextInt()));
    }
}
