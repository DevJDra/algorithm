package String;

import java.io.*;
import java.util.Scanner;

public class 피보나치수열 {

    public static int[] solution(int n){
        int[] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i=2; i<n; i++){
            answer[i] = answer[i-2] + answer[i-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int x : solution(n)) System.out.println(x + " ");
    }

/* 내가 푼 정답
    public static String solution(int n){

        String answer = "1 ";
        int[] arr = new int[n];
        int num = 1;

        for(int i=0; i<n; i++){
            if(i == 0) {
                arr[i] = num;
            }else{
                arr[i] = num;
                num = arr[i-1] + num;
                answer += arr[i] + " ";
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(solution(Integer.parseInt(br.readLine())));
        bw.flush();
    }
    */
}
