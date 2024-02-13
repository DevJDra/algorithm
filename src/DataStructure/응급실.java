package DataStructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 응급실 {
    public static void main(String[] args) {
        응급실 T = new 응급실();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(arr, n, m));
    }

    public int solution(int[] arr, int n, int m) {

        int answer = 0;
        Queue<person> q = new LinkedList<>();

        for(int i=0; i<n; i++) {
            q.offer(new person(i, arr[i]));
        }

        while(!q.isEmpty()) {
            person tmp = q.poll();
            for(person i : q) {
               if(i.priority > tmp.priority) {
                   q.offer(tmp);
                   tmp = null;
                   break;
               }
            }
            if(tmp != null) {
                answer++;
                if (tmp.no == m) return answer;
            }
        }
        return answer;
    }
}

class person {
    int no;
    int priority;

    public person (int no, int priority) {
        this.no = no;
        this.priority = priority;
    }
}
