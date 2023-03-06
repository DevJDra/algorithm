package SortingAndSearching;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 중복확인 {

    public String solution(int n, int[] arr) {

        String result = "U";
        Arrays.sort(arr);
        for(int i=0; i<n-1; i++) {
            if(arr[i] == arr[i+1]) return "D";
        }
        return result;
    }

    public static void main(String args[]) throws IOException {

        중복확인 T = new 중복확인();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(T.solution(n, arr));
        bw.close();
    }
}
