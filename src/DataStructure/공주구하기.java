package DataStructure;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class 공주구하기 {

    public int solution(int n, int k) {
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();

        for(int i=1; i<=n; i++) {
            q.offer(i);
        }

        while(!q.isEmpty()) {
            for(int i=1; i<k; i++) {
                q.offer(q.poll());
            }

            q.poll();

            if(q.size() == 1) {
                answer = q.poll();
            }
        }

        return answer;
    }

    public static void main(String args[]) throws IOException {

        공주구하기 T = new 공주구하기();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(T.solution(n, k)));
        bw.close();
    }
}
