package SortingAndSearching;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 장난꾸러기 {

    public String solution(int n, int[] arr) {

        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i=0; i<n; i++) {
            if(arr[i] != tmp[i]) answer.add(i+1);
        }
        String result = "";
        for(int item : answer) result += item + " ";

        return result;
    }

    public static void main(String[] args) throws IOException {

        장난꾸러기 T = new 장난꾸러기();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(str, " ");
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        bw.write(T.solution(n, arr));
        bw.close();
    }
}
