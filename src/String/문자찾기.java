package String;

import com.sun.tools.javac.Main;

import java.util.Scanner;

public class 문자찾기 {

    public int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase(); //스트링이 대문자로 바뀜
        t = Character.toUpperCase(t); //char이 대문자로 바뀜

//        for(int i=0; i<str.length(); i++){
//            if(str.charAt(i) == t) answer++;
//        }

        for(char x : str.toCharArray()){  //str.toCharArray() => 스트링을 문자 배열 생성
            if(x==t) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        문자찾기 T = new 문자찾기();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0); //입력받은 문자중 첫번째 문자를 리턴
        System.out.println(T.solution(str, c));
    }

    /* 내가 푼 정답 */
//    private static int solution(String a, String b) {
//
//        String[] arr;
//        arr = a.split("");
//
//        int count = 0;
//        for(int i=0; i<a.length(); i++){
//            if(b.equalsIgnoreCase(arr[i])){
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String args[]) throws IOException {
//
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//
//        String a = br.readLine();
//        String b = br.readLine();
//
//        bw.write(String.valueOf(solution(a, b)));
//        bw.close();
//    }
}
