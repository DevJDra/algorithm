package HashMapAndTreeSet;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class 학급회장 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] arr = s.split("");

        Map<String, Integer> map = new HashMap<String, Integer>();

        for(String key : arr) {
            map.put(key, map.getOrDefault(key, 0)+1);
        }
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;

        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            if(entry.getValue() > maxValue) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }
        bw.write(maxKey);
        bw.flush();
        bw.close();
    }
}
