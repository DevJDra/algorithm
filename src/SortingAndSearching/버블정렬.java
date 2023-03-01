package SortingAndSearching;

import java.io.*;
import java.util.StringTokenizer;

public class 버블정렬 {

    public String solution(int n, String str){

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(str, " ");

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        while(n > 1){
            for(int i=0; i<n-1; i++) {
                if(arr[i] > arr[i+1]) {
                    int swap = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = swap;
                }
            }
            n--;
        }
        String result = "";
        for(int i=0; i<arr.length; i++) {
            result += arr[i] + " ";
        }
        return result;
    }

    public static void main(String args[]) throws IOException {

        버블정렬 T = new 버블정렬();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        bw.write(T.solution(n, str));
        bw.close();
    }
}
