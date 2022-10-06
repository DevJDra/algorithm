package String;

import java.io.*;
import java.util.StringTokenizer;

public class 최대매출 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String n = br.readLine();
        StringTokenizer st = new StringTokenizer(n, " ");
        int day = Integer.parseInt(st.nextToken());
        int cnt = Integer.parseInt(st.nextToken());

        String input = br.readLine();
        int[] arr = new int[day];

        st = new StringTokenizer(input, " ");
        int i=0;
        while(st.hasMoreElements()){
            arr[i] = Integer.parseInt(st.nextToken());
            i++;
        }

        int maxMoney = 0;
        for(int j=0; j<day-cnt; j++){
            int money = 0;
            for(int x=j; x<cnt+j; x++) {
                money += arr[x];
            }

            if(maxMoney < money) {
                maxMoney = money;
            }
        }

        bw.write(String.valueOf(maxMoney));
        bw.close();
    }
}
