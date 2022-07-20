package String;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 보이는학생 {

    public static int solution(int n, int[] arr){
        int answer = 1;
        int max = arr[0];
        for(int i=1; i<n; i++){
            if(arr[i] > max){
                answer++;
                max=arr[i];
            }
        }

        return answer;
    }

    public static void main(String[] args){

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(solution(n,arr));
    }

/* 내가 푼 정답
    public static String solution(int n, String s){

        int arr[] = new int[n];

        StringTokenizer st = new StringTokenizer(s, " ");

        int i=0;
        while(st.hasMoreTokens()){
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        int max = arr[0];
        int count = 1;

        for(int j=1; j<arr.length; j++){
            if(arr[j-1] < arr[j] && max < arr[j]){
                count++;
                max = arr[j];
            }
        }

        return String.valueOf(count);
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        bw.write(solution(n, s));
        bw.close();
    }
 */
}
