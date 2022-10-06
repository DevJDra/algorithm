package String;

import java.io.*;
import java.util.Scanner;

public class 숫자만추출 {

    public static int solution(String s){
//        int answer = 0;
        String answer = "";
        for (char x : s.toCharArray()){
 //           if(x>=48 && x<=57) answer = answer * 10 + (x-48);
            if(Character.isDigit(x)){
                answer += x;
            }
        }

        return Integer.parseInt(answer);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
    /**
     * 내가 푼 정답
     */
//    public static String solution(String s){
//        String number = "";
//
//        number = s.replaceAll("[^0-9]", "");
//
//        while(number.startsWith("0")){
//            number = number.substring(1);
//        }
//
//        return number;
//    }
//
//    public static void main(String args[]) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        bw.write(solution(br.readLine()));
//        bw.close();
//    }
}
