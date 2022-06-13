import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        String B = scan.next();
        String lastB = B.substring(B.length()-1, B.length());
        String mB = B.substring(B.length()-2, B.length()-1);
        String fB = B.substring(B.length()-3, B.length()-2);

        System.out.println(Integer.parseInt(lastB) * A);
        System.out.println(Integer.parseInt(mB) *A);
        System.out.println(Integer.parseInt(fB) *A);
        System.out.println(Integer.parseInt(B) *A);
    }
}
