package String;

import java.io.*;
import java.util.Scanner;

public class 회문문자열 {

    public static String solution(String str){
        String answer = "YES";

        String tmp = new StringBuilder(str).reverse().toString();
        if(!str.equalsIgnoreCase(tmp)) answer="NO";
//        str=str.toUpperCase();
//        int len = str.length();
//
//        for(int i=0; i<len/2; i++){
//            if(str.charAt(i) != str.charAt(len-i-1)) return "NO";
//        }

        return answer;
    }
    public static void main(String args[]) throws IOException {

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }

/* 내가 푼 정답
    public static String solution(String kb){
        String answer;
        int lt = 0 , rt = kb.length()-1;
        boolean chk = true;
        while(lt<rt){
            if(kb.charAt(lt) != kb.charAt(rt)) chk = false;
            lt++;
            rt--;
        }
        if(chk == true) answer = "YES";
        else answer = "NO";

        return answer;
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String kb = br.readLine();
        kb = kb.toLowerCase();

        bw.write(solution(kb));
        bw.close();
    }
*/

}
