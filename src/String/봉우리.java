package String;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 봉우리 {

    static int[] dx = {-1,0,1,0};
    static int[] dy = {0,1,0,-1};

    public static int solution(int n, int[][] arr){
        int answer = 0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                for(int k=0; k<4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if(nx>0 && nx<n && ny>=0 && ny<n && arr[nx][ny] >= arr[i][j] ){
                        flag = false;
                        break;
                    }
                }
                if(flag) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(solution(n, arr));
    }

/* 내가 푼 정답
    public static int solution(int[][] arr){

        int count = 0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(i != 0 && j != 0){
                    if(arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i+1][j] &&
                    arr[i][j] > arr[i][j-1] && arr[i][j] >arr[i][j+1]) {
                        count++;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String kb = "";
        int[][] arr = new int[n+2][n+2];

        for(int i=0; i<arr.length; i++){
            arr[i][0] = 0;
            arr[0][i] = 0;
        }

        for(int i=1; i<arr.length-1; i++){
            kb = br.readLine();
            StringTokenizer st = new StringTokenizer(kb, " ");
            for(int j=1; j<arr.length-1; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bw.write(String.valueOf(solution(arr)));
        bw.close();
    }
    */
}
