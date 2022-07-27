package String;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 뒤집은소수 {

    public static boolean isPrime(int num){
        if(num == 1) return false;
        for(int i=2; i<num; i++){
            if(num%i == 0) return false;
        }
        return true;
    }

    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0; i<n; i++){
            int tmp = arr[i];
            int res = 0;
            while(tmp > 0){
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }
            if(isPrime(res)) answer.add(res);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : solution(n,arr)){
            System.out.print(x + " ");
        }
    }
/* 내가 푼 정답
    public static String solution(String a, String b){

        StringTokenizer st = new StringTokenizer(b, " ");
        String s = "";
        String answer = "";
        while(st.hasMoreTokens()){
            s = st.nextToken();
            String t = "";
            for(int i=0; i<s.length(); i++){
                t += s.substring(s.length()-(i+1), s.length()-i);
            }

            for(int i=0; i<t.length(); i++){
                String chkZero = t.substring(i, i+1);
                if(!chkZero.equals("0")){
                    t = t.substring(i, t.length());
                    break;
                }
            }
            int num = Integer.parseInt(t);
            boolean chkDecimal = true;
            if(num != 1) {
                for (int i = 2; i < num; i++) {
                    if (num % i == 0) {
                        chkDecimal = false;
                    }
                }
                if(chkDecimal) answer += String.valueOf(num)+ " ";
            }
        }

        return answer;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write(solution(br.readLine(), br.readLine()));
        bw.close();
    }
*/

}
