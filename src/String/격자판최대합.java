package String;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class 격자판최대합 {

    public static int solution(int[][] arr) {

        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        int sum4 = 0;
        List<Integer> list = new ArrayList<>();

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                sum += arr[i][j];
                sum2 += arr[j][i];
                if(i == j) {
                    sum3 += arr[i][j];
                    sum4 += arr[j][i];
                }
            }
            list.add(sum);
            list.add(sum2);

            sum = 0;
            sum2 = 0;
        }
        list.add(sum3);
        list.add(sum4);

        return Collections.max(list);
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];


        for(int i=0; i<n; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input, " ");
            for(int j=0; j<n; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        bw.write(String.valueOf(solution(arr)));
        bw.close();
    }
}
