package SortingAndSearching;

import java.io.*;
import java.util.StringTokenizer;

public class LRU {

    public String solution(int s, int n, int[] arr) {

        int[] cache = new int[s];
        for (int x : arr) {
            int pos = -1;
            for(int i=0; i<s; i++) {
                if(x==cache[i]) pos = i;
            }

            if(pos == -1) {
                for(int i=s-1; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
            } else {
                for(int i=pos; i>=1; i--) {
                    cache[i] = cache[i-1];
                }
            }
            cache[0] = x;
        }

        String result = "";

        for(int item : cache) {
            result += item + " ";
        }

        return result;
    }

    public static void main(String args[]) throws IOException {
        LRU T = new LRU();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String sn = br.readLine();

        StringTokenizer st = new StringTokenizer(sn, " ");
        int s = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        String str = br.readLine();
        st = new StringTokenizer(str, " ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(T.solution(s, n, arr));
        bw.close();
    }
}
