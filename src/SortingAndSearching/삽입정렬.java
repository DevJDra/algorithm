package SortingAndSearching;

import java.io.*;
import java.util.StringTokenizer;

public class 삽입정렬 {

    public String solution(int n, int[] arr){
//
//        for(int i=0; i<n-1; i++){
//            for(int j=i+1; j>0; j--) {
//                if(arr[j] < arr[j-1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j-1];
//                    arr[j-1] = temp;
//                }
//            }
//        }

        for(int i=1; i<n; i++) {
            int temp = arr[i], j;
            for(j=i-1; j>=0; j--) {
                if(arr[j]>temp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = temp;
        }

        String result = "";
        for(int i=0; i<arr.length; i++) {
            result += arr[i] + " ";
        }

        return result;
    }

    public static void main(String args[]) throws IOException {

        삽입정렬 T = new 삽입정렬();

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
