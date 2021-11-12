import java.sql.SQLOutput;
import java.util.Scanner;

// codeforces.com/contest/515/problem/A
 
public class Drazil {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int S = s.nextInt();
        if(S >= Math.abs(a) + Math.abs(b) && (S - Math.abs(a) - Math.abs(b)) % 2 ==0) System.out.println("YES");
        else System.out.println("NO");
    }
}