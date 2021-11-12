import java.math.BigInteger;
import java.util.Scanner;

// codeforces.com/contest/114/problem/A

public class Cifera {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int k = s.nextInt();
        BigInteger l = s.nextBigInteger();
        int br = 0;
        boolean b = true;
        while(l.compareTo(BigInteger.ONE) > 0) {
            if(l.mod(BigInteger.valueOf(k)).equals(BigInteger.ZERO)) {
                l = l.divide(BigInteger.valueOf(k));
                br++;
            }
            else {
                b = false;
                break;
            }
        }
        if(b) {
            System.out.println("YES");
            System.out.println(br - 1);
        }
        else System.out.println("NO");
    }
}