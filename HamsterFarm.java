import java.math.BigInteger;
import java.util.Scanner;

// codeforces.com/contest/939/problem/B

public class HamsterFarm {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger N = s.nextBigInteger();
        int k = s.nextInt();
        BigInteger[] a = new BigInteger[k + 1];
        for(int i = 1; i <= k; i++) a[i] = s.nextBigInteger();
        int index = 1;
        BigInteger boxes = BigInteger.ZERO, min = N.mod(a[1]);
        for(int i = 1; i <= k; i++) {
            if(N.mod(a[i]).compareTo(min) < 0) {
                min = N.mod(a[i]);
                index = i;
            }
        }
        N =N.subtract(N.mod(a[index]));
        boxes = N.divide(a[index]);
        System.out.println(index + " " + boxes);
    }
}