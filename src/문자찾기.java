import java.io.*;
import java.util.StringTokenizer;

public class 문자찾기 {

    private static int solution(String a, String b) {

        String[] arr;
        arr = a.split("");

        int count = 0;
        for(int i=0; i<a.length(); i++){
            if(b.equalsIgnoreCase(arr[i])){
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();

        bw.write(String.valueOf(solution(a, b)));
        bw.close();
    }
}
