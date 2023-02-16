package HashMapAndTreeSet;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class 아나그램 {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

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
/*
    public String solution(String s1, String s2) {
        String answer = "YES";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0)+1);
        }

        for(char x : s2.toCharArray()) {
            if(!map.containsKey(x) || map.get(x) == 0) return "NO";
            map.put(x, map.get(x) - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        아나그램 T = new 아나그램();
        Scanner kb = new Scanner(System.in);
        String a = kb.next();
        String b = kb.next();
        System.out.println(T.solution(a, b));
    }
 */
}
