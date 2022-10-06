package String;

import java.io.*;
import java.util.*;

public class 두_배열_합치기 {

    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1<n && p2<m){
            if(a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);

        return answer;

    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = kb.nextInt();
        }

        for(int x : solution(n, m, a, b)) System.out.println(x + " ");
    }
/* 내가 푼 정답
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        int input = 0;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()) {
            input = Integer.parseInt(st.nextToken());
            list.add(input);
        }
        n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine(), " ");
        while(st.hasMoreTokens()) {
            input = Integer.parseInt(st.nextToken());
            list.add(input);
        }
        Collections.sort(list);

        for(int i : list){
            bw.write(String.valueOf(i) + " ");
        }
        bw.flush();
        bw.close();
    }
    */
}
