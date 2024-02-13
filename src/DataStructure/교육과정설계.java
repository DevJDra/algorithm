package DataStructure;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class 교육과정설계  {

    public static void main(String[] args) throws IOException {
        교육과정설계 T = new 교육과정설계();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String k = sc.next();
        System.out.println(T.solution(s, k));

    }

    public String solution(String s, String k) {
        String answer = "YES";

        Queue<Character> q = new LinkedList<>();
        for(char item : s.toCharArray()) q.offer(item);
        for(char item : k.toCharArray()) {
            if(q.contains(item)) {
                if(item != q.poll()) {
                    return "NO";
                }
            }
        }
        if(!q.isEmpty()) return "NO";
        return answer;
    }
}
