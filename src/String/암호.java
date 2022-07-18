package String;

import java.io.*;
import java.util.Scanner;

public class 암호 {

    public static String solution(int n, String s){
        String answer = "";

        for(int i=0; i<n; i++){
            String tmp = s.substring(0, 7).replace('#','1').replace('*', '0');
            int num = Integer.parseInt(tmp, 2);
            answer += (char)num;
            s = s.substring(7);
        }

        return answer;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();호
        System.out.println(solution(n, str));
    }

/* 내가 푼 정답
    public static String solution(int num, String s){

        String answer = "";
        int cnt = 0;
        String binary = "";

        for(int i=1; i <= num * 7; i++){

            if((s.substring(i-1,i)).equals("#")){
                binary += "1";
            }else if((s.substring(i-1,i)).equals("*")){
                binary += "0";
            }

            if(i != 1 && i%7 == 0){
                int decimal = Integer.parseInt(binary, 2);
                char ch = (char)decimal;
                answer += String.valueOf(ch);
                binary = "";
            }
        }
        return answer;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(solution(Integer.parseInt(br.readLine()), br.readLine()));
        bw.close();
    }
    */
}
