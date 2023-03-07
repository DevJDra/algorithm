package SortingAndSearching;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 이분검색 {

    public int solution(int n, int k, int[] arr) {

        int result = 0;
        Arrays.sort(arr);
        int lt=0, rt=n-1;
        while(lt <= rt) {
            int mid = (lt+rt) / 2;
            if(arr[mid] == k) {
                result = mid+1;
                break;
            }
            if(arr[mid] > k) rt = mid-1;
            else lt=mid+1;
        }
        return result;
    }

    public static void main(String args[]) throws IOException {

        이분검색 T = new 이분검색();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        str = br.readLine();
        st = new StringTokenizer(str," ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        bw.write(T.solution(n, k, arr));
        bw.close();
    }
}
