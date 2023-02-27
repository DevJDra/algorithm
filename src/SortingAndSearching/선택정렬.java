package SortingAndSearching;

import java.io.*;
import java.util.StringTokenizer;

public class 선택정렬 {

    public String solution(int n, Integer[] arr) {

        for(int i=0; i<arr.length - 1; i++) {
            int idx = i;
            for(int j=i+1; j<n; j++) {
                if(arr[j] < arr[idx]) idx=j;
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        String result = "";
        for(int item : arr) {
            result += item + " ";
        }

        return result;
    }

    public static void main(String args[]) throws IOException {

        선택정렬 T = new 선택정렬();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        Integer[] arr = new Integer[n];
        StringTokenizer st = new StringTokenizer(str, " ");

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(T.solution(n, arr));
        bw.close();
    }
}
