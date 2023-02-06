package Greedy;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Greedy : 현재 시점에 최선의 선택을 할 것
 * 이중 for문 사용시 시간 복잡도 O(n2)
 * 하나를 정렬 후 for문 사용시 시간복잡도 O(n)
 * 최초의 접근법을 이중 for문으로 떠올렸음. 항상 for문 사용시 단일 for문으로 사용할 수 없는지 생각할 것
 */
public class 씨름선수 {


    /**
     * 단일 for문 사용
     * 시간 복잡도 : O(n)
     * time : 119ms
     */
    public int solution(ArrayList<Body> arr, int n) {
        int cnt = 0;
        Collections.sort(arr); //height를 기준으로 내림차순 정렬
        int max = Integer.MIN_VALUE;
        for(Body ob : arr) {
            if(ob.w > max) { //max값으로 비교하여 카운트
                max=ob.w;
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        씨름선수 T = new 씨름선수();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String input;
        ArrayList<Body> arr = new ArrayList<>();

        for(int i=0; i<n; i++){
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            arr.add(new Body(h, w));
        }
        bw.write(String.valueOf(T.solution(arr, n)));
        bw.close();
    }

    /**
     *  이중 for문 사용
     *  시간복잡도 : O(n2)
     *  time : 126ms
     */
/*
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean chk = false;
        int count = 0;

        int[][] arr = new int[n][2];
        String input;
        StringTokenizer st;

        for(int i=0; i<n; i++) {
            input = br.readLine();
            st = new StringTokenizer(input, " ");
            for(int j=0; j<2; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for(int x=0; x<n; x++){
            for(int y=0; y<n; y++){
                if(x != y){
                    if(arr[x][0] < arr[y][0] && arr[x][1] < arr[y][1]) {
                        chk = true;
                        break;
                    }
                }
            }
            if(chk == false) {
                count++;
            } else {
                chk = false;
            }
        }

        bw.write(String.valueOf(count));
        bw.close();
    }
*/
}

class Body implements Comparable<Body>{
    public int h, w;
    Body(int h, int w) {
        this.h = h;
        this.w = w;
    }

    @Override
    public int compareTo(Body o) {
        return o.h - this.h;
    }
}
