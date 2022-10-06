package String;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {

    public ArrayList<String> solution(int n, String[] str) {
        ArrayList<String> answer = new ArrayList<>();
        /**
         *StringBuilder 이용
         */
//        for(String x : str){
//            String tmp = new StringBuilder(x).reverse().toString();
//            answer.add(tmp);
//        }

        for(String x : str) {
            char[] s = x.toCharArray();
            int lt = 0, rt = x.length()-1;
            while(lt < rt){
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }
        return answer;
    }

    public static void main(String args[]) throws IOException {

        단어뒤집기 T = new 단어뒤집기();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String[] str = new String[n];
        for(int i=0; i<n; i++){
            str[i]=kb.next();
        }
        for(String x : T.solution(n, str)){
            System.out.println(x);
        }

        /**
         * 내가 푼 정답
         **/
/*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int loop = Integer.parseInt(br.readLine());

        String kb;
        for(int i=0; i<loop; i++){
            kb = br.readLine();
            String result = "";
            for(int j=0; j<kb.length(); j++){
                result += kb.substring(kb.length()-(j+1) , kb.length()-j);
            }
            bw.write(result + "\n");
        }
        bw.close();

*/
    }
}
