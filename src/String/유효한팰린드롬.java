package String;

import java.io.*;
import java.util.Scanner;

public class 유효한팰린드롬 {

    public static String solution(String s) {
        String answer = "NO";
        s = s.toUpperCase().replaceAll("[^A=Z]", "");
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String args[]){

        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(solution(str));
    }
    /**
     * 내가 푼 정답
     */
//    public static String solution(String kb){
//
//        String answer = "";
//        kb = kb.replaceAll("[^a-zA-Z]","");
//
//        boolean chk = true;
//        int length = (int) Math.floor(kb.length() / 2);
//
//        for(int i=0; i<length; i++){
//            if(Character.toUpperCase(kb.charAt(i)) != Character.toUpperCase(kb.charAt(((kb.length()-1))-i))) chk = false;
//        }
//
//        if(chk == true) {
//            answer = "YES";
//        }
//        else {
//            answer = "NO";
//        }
//
//        return answer;
//    }
//
//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String kb = br.readLine();
//        bw.write(solution(kb));
//        bw.close();
//    }
}
