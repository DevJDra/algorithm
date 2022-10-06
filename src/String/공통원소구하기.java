package String;

import java.io.*;
import java.util.*;

public class 공통원소구하기 {

    public static ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1=0,p2=0;

        while(p1<n && p2<m){
            if(a[p1] == b[p2]){
                answer.add(a[p1++]);
                p2++;
            }else if(a[p1] < b[p2]){
                p1++;
            }else{
                p2 ++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = kb.nextInt();
        }

        for(int x : solution(n, m, a, b)) System.out.print(x + " ");

    }



//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int a = Integer.parseInt(br.readLine());
//        int[] arr = new int[a];
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//
//        int i=0;
//        while(st.hasMoreTokens()){
//            arr[i] = Integer.parseInt(st.nextToken());
//            i++;
//        }
//
//        int b = Integer.parseInt(br.readLine());
//        int[] arr2 = new int[b];
//        st = new StringTokenizer(br.readLine(), " ");
//        i=0;
//        while(st.hasMoreTokens()){
//            arr2[i] = Integer.parseInt(st.nextToken());
//            i++;
//        }
//
//        List<Integer> list = new ArrayList<>();
//
//        for(int x=0; x<arr.length; x++){
//            for(int y=0; y<arr2.length; y++){
//                if(arr[x] == arr2[y]){
//                    list.add(arr[x]);
//                }
//            }
//        }
//
//        Collections.sort(list);
//
//        for(int item : list){
//            bw.write(String.valueOf(item) + " ");
//        }
//        bw.close();
//    }
}
