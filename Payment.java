import java.math.BigInteger;
import java.util.Scanner;

// codeforces.com/contest/1256/problem/A
 
public class Payment {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int q = s.nextInt();
        BigInteger a, b, n, S;
        for(int i = 0; i < q; i++) {
            a = s.nextBigInteger();
            b = s.nextBigInteger();
            n = s.nextBigInteger();
            S = s.nextBigInteger();
            if(a.multiply(n).add(b).compareTo(S) >= 0 && S.mod(n).compareTo(b) <= 0) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}