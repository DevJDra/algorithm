package String;

import com.sun.tools.javac.Main;

import java.io.*;
import java.util.Scanner;

public class 대소문자_변환 {

    public String solution(String str){
        String answer = "";
        for(char x : str.toCharArray()){

            if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);

            //아스키코드 => 대문자 : 65 ~ 90 , 소문자 : 97 ~ 122 => 차이 : 32
//            if(x>=65 && x<=90) { //대문자
//                answer += (char)(x-32); //char에 - 하는 순간 정수형이됨
//            }
//            if(x>=97 && x<=122) { //소문자
//                answer += (char)(x+32);
//            }
        }
        return answer;
    }

    public static void main(String[] args){
        대소문자_변환 T = new 대소문자_변환();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }

    /*내가 푼 정답*/
//    public static String solution(String str){
//
//        String answer = "";
//        for(char x : str.toCharArray()){
//            if(Character.isUpperCase(x)){
//                answer += Character.toLowerCase(x);
//            }else if(Character.isLowerCase(x)){
//                answer += Character.toUpperCase(x);
//            }
//        }
//        return answer;
//    }
//
//    public static void main(String args[]) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String str = br.readLine();
//
//        bw.write(solution(str));
//        bw.flush();
//        bw.close();
//    }
}
