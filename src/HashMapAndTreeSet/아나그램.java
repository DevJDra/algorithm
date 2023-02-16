package HashMapAndTreeSet;

import java.io.*;
import java.util.Arrays;

public class 아나그램 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String[] arr = a.split("");
        String b = br.readLine();
        String[] ar = b.split("");

        Arrays.sort(arr);
        Arrays.sort(ar);

        String anagram = "YES";
        for (int i = 0; i < arr.length; i++) {
            if(!arr[i].equals(ar[i])){
                anagram = "NO";
                break;
            }
        }
        System.out.println(anagram);
    }
}
