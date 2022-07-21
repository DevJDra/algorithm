package String;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 가위바위보 {

    public static String solution(int n, int[] a, int[] b){
        String answer = "";
        for(int i=0; i<n; i++){
            if(a[i] == b[i]) answer+="D";
            else if(a[i]==1 && b[i]==3) answer+="A";
            else if(a[i]==2 && b[i]==1) answer+="A";
            else if(a[i]==3 && b[i]==2) answer+="A";
            else answer+="B";
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        for(int i=0; i<n; i++){
            a[i] = kb.nextInt();
        }
        for(int i=0; i<n; i++){
            b[i] = kb.nextInt();
        }
        for(char x : solution(n, a, b).toCharArray()) System.out.println(x);
    }
/* 내가푼 정답
    public static String solution(int cnt, String A, String B) {
        String answer = "";

        ArrayList<String> aList = new ArrayList<>();
        ArrayList<String> bList = new ArrayList<>();
        StringTokenizer stA = new StringTokenizer(A, " ");
        StringTokenizer stB = new StringTokenizer(B, " ");
        for (int i = 0; i < cnt; i++) {
            aList.add(stA.nextToken());
            bList.add(stB.nextToken());
        }

        for (int i = 0; i < cnt; i++) {
            answer += rsp(Integer.parseInt(aList.get(i)), Integer.parseInt(bList.get(i))) + "\n";
        }

        return answer;
    }

    public static String rsp(int a, int b) {
        String rsp = "";
        if (a == 1 && b == 2) {
            rsp = "B";
        } else if (a == 1 && b == 3) {
            rsp = "A";
        } else if (a == 2 && b == 1) {
            rsp = "A";
        } else if (a == 2 && b == 3) {
            rsp = "B";
        } else if (a == 3 && b == 1) {
            rsp = "B";
        } else if (a == 3 && b == 2) {
            rsp = "A";
        } else if (a == b) {
            rsp = "D";
        }

        return rsp;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String A = br.readLine();
        String B = br.readLine();

        bw.write(solution(n, A, B));
        bw.close();
    }*/
}
