package String;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class 중복문자제거 {

    public static String solution(String str) {

        String answer="";
        for(int i=0; i<str.length(); i++){
            //System.out.println(str.charAt(i) + " "+ i +" "+ str.indexOf(str.charAt(i)));
            //indexOf() => 해당문자 위치를 찾음
            if(str.indexOf(str.charAt(i)) == i) answer+=str.charAt(i);
        }

        return answer;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }

/* 내가 푼 정답
    public static String solution(String kb){

        char[] arr = new char[kb.length()];

        arr = kb.toCharArray();

        LinkedHashSet<String> hashSet = new LinkedHashSet<>();

        for(char item : arr) {
            hashSet.add(String.valueOf(item));
        }

        String result ="";
        for (String character : hashSet){
            result += character;
        }

        return result;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        bw.write(solution(input));
        bw.flush();
        bw.close();
    }
    */
}
