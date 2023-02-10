package Greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class 최대수입스케쥴 {

    static int number , max=Integer.MIN_VALUE;
    public int solution(ArrayList<Lesson> arr, int n) {

        int answer = 0;
        /* PriorityQueue<Integer> pQ = new PriorityQueue<>() => 작은값을 우선으로 함 */
        PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
        Collections.sort(arr);
        int j=0;
        for(int i=max; i>=1; i--){
            for( ; j<n; j++){
                if(arr.get(j).time<i) break;
                pQ.offer(arr.get(j).money);
            }
            if(!pQ.isEmpty()) answer += pQ.poll();
        }

        return answer;
    }

    public static void main(String args[]) throws IOException {

        최대수입스케쥴 T = new 최대수입스케쥴();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Lesson> list = new ArrayList<>();
        StringTokenizer st;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int m = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            list.add(new Lesson(m,d));
            if(d>max) max=d;
        }
        T.solution(list, n);
        bw.write(String.valueOf(T.solution(list, n)));
        bw.close();
    }
}

class Lesson implements Comparable<Lesson> {

    int money;
    int time;

    Lesson(int money, int time) {
        this.money = money;
        this.time = time;
    }

    @Override
    public int compareTo(Lesson lesson) {
        return lesson.time - this.time;
    }
}
