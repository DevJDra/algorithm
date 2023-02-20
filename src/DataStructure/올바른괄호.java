package DataStructure;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class 올바른괄호 {

    public String solution(String str) {
        String answer = "YES";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(x == '(') {
                stack.push(x);
            }
            else {
                if(stack.isEmpty()) {
                    return "NO";
                }
                stack.pop();
            }
        }
        if(!stack.isEmpty()) {
            return "NO";
        }
        return answer;
    }

    public static void main(String args[]) {
        올바른괄호 T = new 올바른괄호();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
/*
    public String solution(String[] arr) {

        int r = 0;
        int l = 0;
        String result;

        for(int i=0; i<arr.length; i++) {
            if(arr[i].equals("(")) {
                r++;
            } else if (arr[i].equals(")")) {
                l++;
            }

            if(r < l) {
                return "NO";
            }
        }

        if(r == l) {
            result = "YES";
        } else {
            result = "NO";
        }

        return result;
    }

    public static void main(String args[]) throws IOException {

        올바른괄호 T = new 올바른괄호();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] arr = str.split("");

        bw.write(T.solution(arr));
        bw.close();
    }
    */
}
