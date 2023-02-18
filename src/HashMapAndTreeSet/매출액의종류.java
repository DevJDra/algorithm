package HashMapAndTreeSet;

import java.io.*;
import java.util.*;

public class 매출액의종류 {

    public ArrayList<Integer> solution(int n, int k , int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> HM = new HashMap<>();
        for(int i=0; i<k-1; i++){
            HM.put(arr[i], HM.getOrDefault(arr[i], 0)+1);
        }
        int lt=0;
        for(int rt=k-1; rt<n; rt++) {
            HM.put(arr[rt], HM.getOrDefault(arr[rt],0)+1);
            answer.add(HM.size());
            HM.put(arr[lt], HM.get(arr[lt])-1);
            if(HM.get(arr[lt]) == 0) HM.remove(arr[lt]);
            lt++;
        }
        return answer;
    }


    public static void main(String[] args) {
        매출액의종류 T = new 매출액의종류();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(n, k, arr)) System.out.println(x+" ");
    }

/*
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        StringTokenizer st = new StringTokenizer(input, " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        input = br.readLine();
        st = new StringTokenizer(input, " ");
        ArrayList<Integer> list = new ArrayList<>();

        while(st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }

        HashSet hash = new HashSet<>();
        String result = "";

        for(int i=0; i<=n-k; i++) {
            for(int j=i; j<i+k; j++){
                hash.add(list.get(j));
            }
            result += hash.size() + " ";
            hash.clear();
        }
        bw.write(result);
        bw.close();
    }
    */
}
