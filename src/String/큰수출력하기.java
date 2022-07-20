package String;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 큰수출력하기 {

    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1; i<n; i++){
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
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
        for(int x : solution(n, arr)){
            System.out.println(x+ " ");
        }
    }

/* 내가 푼 정답
    public static String solution(int n, String s){

        int[] arr = new int[n];

        StringTokenizer st = new StringTokenizer(s, " ");
        int j = 0;
        while(st.hasMoreTokens()){
            arr[j] = Integer.parseInt(st.nextToken());
            j++;
        }

        String result = String.valueOf(arr[0]);

        for(int i=1; i<arr.length; i++){
            if(arr[i-1] < arr[i] ){
                result += " " + String.valueOf(arr[i]);
            }
        }
        return result;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        bw.write(solution(n,s));
        bw.close();
    }
    */
}
