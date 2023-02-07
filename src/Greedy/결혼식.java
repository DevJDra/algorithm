package Greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 결혼식 {

    public int solution(ArrayList<Times> arr) {
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt = 0;
        for(Times ob : arr) {
            if(ob.state == 's') {
                cnt++;
            } else {
                cnt--;
            }
            answer = Math.max(answer, cnt);
        }
        return answer;
    }

    public static void main(String args[]) throws IOException {

        결혼식 T = new 결혼식();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        ArrayList<Times> list = new ArrayList<>();
        StringTokenizer st;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            list.add(new Times(s,'s'));
            list.add(new Times(e,'e'));
        }
        bw.write(String.valueOf(T.solution(list)));
        bw.close();
    }
}

class Times implements Comparable<Times> {

    int time;
    char state;
    Times(int time, char state) {
        this.time = time;
        this.state = state;
    }

    @Override
    public int compareTo(Times ob) {
        if(this.time == ob.time) { //시간이 같을때 알파벳 정렬
            return this.state - ob.state;
        } else {
            return this.time-ob.time;
        }
    }
}
