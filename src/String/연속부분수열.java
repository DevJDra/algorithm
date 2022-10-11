package String;

import java.io.*;
import java.util.StringTokenizer;

public class 연속부분수열 {

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String condition = br.readLine();
        StringTokenizer st = new StringTokenizer(condition, " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String input = br.readLine();

        int arr[] = new int[N];
        st = new StringTokenizer(input, " ");

        int num = 0;
        while(st.hasMoreTokens()){
            arr[num] = Integer.parseInt(st.nextToken());
            num++;
        }

        int cnt = 0;
        for(int i=0; i<N; i++){
            int result = 0;
            for(int x=i; x<N; x++){
                result += arr[x];
                if(result == M) {
                    cnt++;
                }else if(result > M){
                    break;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.close();
    }
}
