package String;

import java.io.*;
import java.util.StringTokenizer;

public class 문장속단어 {

    public static String solution(String[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j=i; j<arr.length; j++){
                if(arr[i].length() < arr[j].length()) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr[0];
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String kb = br.readLine();

        StringTokenizer st = new StringTokenizer(kb, " ");
        String[] arr = new String[st.countTokens()];

        int index = 0;
        while(st.hasMoreTokens()){
            arr[index] = st.nextToken();
            index++;
        }
        bw.write(solution(arr));
        bw.close();
    }
}
