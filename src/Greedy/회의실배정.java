package Greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class 회의실배정 {

    public int solution(ArrayList<Time> arr, int n){
        int cnt = 0;
        Collections.sort(arr);
        int et = 0;
        for(Time ob : arr) {
            if(ob.s >= et) {
                cnt++;
                et=ob.e;
            }
        }
        return cnt;
    }

    public static void main(String args[]) throws IOException {

        회의실배정 T = new 회의실배정();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        ArrayList<Time> arr = new ArrayList<>();
        StringTokenizer st;
        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            arr.add(new Time(x, y));
        }
        bw.write(String.valueOf(T.solution(arr, n)));
        bw.close();
    }
}

class Time implements Comparable<Time> {
    public int s, e;
    Time(int s, int e) {
        this.s = s;
        this.e = e;
    }

    @Override
    public int compareTo(Time o) {
        if(this.e == o.e) {
            return this.s - o.s;
        } else {
            return this.e - o.e;
        }
    }
}
