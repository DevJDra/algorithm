package String;

import java.io.*;

public class 연속된_자연수의_합 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for(int i=1; i<n-1; i++){
            int sum = 0;
            for(int j=i; j<n-1; j++){
                sum += j;

                if(sum == n) {
                    cnt++;
                }else if(sum > n){
                    break;
                }
            }
        }

        bw.write(String.valueOf(cnt));
        bw.close();
    }
}
