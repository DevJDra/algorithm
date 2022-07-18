package String;

import java.io.*;
import java.util.Scanner;

public class 문자열압축 {
    public static String solution(String s) {
        String answer = "";
        s = s + " ";
        int cnt = 1;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i) == s.charAt(i+1)) cnt++;
            else{
                answer += s.charAt(i);
                if(cnt > 1) answer += String.valueOf(cnt);
                cnt = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));

    }

/*내가 푼 문제 정답
    public static String solution(String input) {

        char[] charArr = input.toCharArray();
        String result = "";

        int count = 1;
        for(int i=0; i<charArr.length; i++){

            if(i < charArr.length - 1) {
                if (charArr[i] != charArr[i + 1]) {
                    result += charArr[i] + String.valueOf(count == 1 ? "" : count);
                    count = 1;
                } else {
                    count++;
                }
            }else{
                if (charArr[i-1] == charArr[i]) {
                    result += charArr[i] + String.valueOf(count == 1 ? "" : count);
                }else{
                    result += charArr[i];
                }
            }
        }

        return result;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();

        bw.write(solution(input));
        bw.close();
    }
*/
}
