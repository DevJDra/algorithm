package DataStructure;

import java.io.*;
import java.util.Scanner;
import java.util.Stack;

public class 괄호문자제거 {

    public String solution(String str) {
        String answer = "";
        Stack<Character> stack = new Stack<>();
        for(char x : str.toCharArray()) {
            if(x==')') {
                while(stack.pop() != '(');
            } else {
                stack.push(x);
            }
        }

        for(int i=0; i<stack.size(); i++) {
            answer += stack.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        괄호문자제거 T = new 괄호문자제거();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
/*
    public String solution(String str) {

        int r = 0;
        int l = 0;
        String result = "";
        for(char item : str.toCharArray()) {
                if(item == '(') {
                    r++;
                } else if(item == ')') {
                    l++;
                } else {
                    if(r == l) result += item;
                }
        }

        return result;
    }

    public static void main(String args[]) throws IOException {

        괄호문자제거 T = new 괄호문자제거();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        bw.write(T.solution(str));
        bw.close();
    }
    */
}
