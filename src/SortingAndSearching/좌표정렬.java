package SortingAndSearching;

import java.awt.*;
import java.io.*;
import java.util.*;

class Point implements Comparable<Point> {
    public int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if(this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class 좌표정렬 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();

        for(int i=0; i<n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();
            arr.add(new Point(x, y));
        }
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x+ " " + o.y);

    }
//
//    public int[][] solution(int n, int[][] arr) {
//
//        Arrays.sort(arr, (o1, o2) -> {
//           if(o1[0] == o2[0]){
//               return Integer.compare(o1[1], o2[1]);
//           } else {
//               return Integer.compare(o1[0], o2[0]);
//           }
//        });
//
//        return arr;
//    }
//
//    public static void main(String args[]) throws IOException {
//        좌표정렬 T = new 좌표정렬();
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        int n = Integer.parseInt(br.readLine());
//        int[][] arr = new int[n][2];
//
//        for(int i=0; i<n; i++) {
//            String str = br.readLine();
//            StringTokenizer st = new StringTokenizer(str, " ");
//            for(int j=0; j<2; j++) {
//                arr[i][j] = Integer.parseInt(st.nextToken());
//            }
//        }
//
//        arr = T.solution(n, arr);
//        String result = "";
//        for(int i=0; i<n; i++) {
//            for(int j=0; j<2; j++) {
//                result += arr[i][j];
//                if(j != 1) result += " ";
//            }
//            if(i != n-1) result += "\n";
//        }
//        bw.write(result);
//        bw.close();
//    }
//
}
