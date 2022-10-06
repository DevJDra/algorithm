package String;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 임시반장_정하기 {

    public static int solution(int n, int[][] arr){
        int answer = 0, max=Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){
            int cnt=0;
            for(int j=1; j<=n; j++){
                for(int k=1; k<=5; k++){
                    if(arr[i][k] == arr[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt>max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n+1][6];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=5; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }

/*
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        int[] count = new int[]{0, 0, 0, 0, 0};

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                for (int z = 0; z < n; z++) {
                    if (arr[y][x] == arr[z][x] && y != z) {
                        count[y] += 1;
                    }
                }
            }
        }

        int result = 0;
        for (int i = 0; i < count.length - 1; i++) {
            if (count[i] >= count[i + 1]) {
                result = i+1;
            } else {
                result = i+2;
            }
        }
        bw.write(String.valueOf(result));
        bw.close();
    }
    */
}
