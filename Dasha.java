import java.util.Scanner;

// codeforces.com/contest/761/problem/A
 
public class Dasha {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(Math.abs(a - b) > 1 || (a == 0 && b == 0)) System.out.println("NO");
        else System.out.println("YES");
    }
}