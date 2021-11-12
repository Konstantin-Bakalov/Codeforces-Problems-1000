import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

// codeforces.com/contest/1117/problem/B

public class Emotes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int k = s.nextInt();
        int[] a = new int[n + 1];
        BigInteger res = BigInteger.ZERO;
        int j = 0;
        for(int i = 1; i <= n; i++) a[i] = s.nextInt();
        BigInteger max = BigInteger.ZERO, smax = BigInteger.ZERO;
        for(int i = 1; i <= n; i++) {
            if(BigInteger.valueOf(a[i]).compareTo(max) > 0) {
                max = BigInteger.valueOf(a[i]);
                j = i;
            }
        }
        for(int i = 1; i <= n; i++) {
            if(BigInteger.valueOf(a[i]).compareTo(smax) > 0 && smax.compareTo(max) <= 0 && i != j)
                smax = BigInteger.valueOf(a[i]);
        }
        //System.out.println(max + " " + smax);
        int second = m / (k + 1);
        int first = m - second;
        res = res.add(BigInteger.valueOf(first).multiply(max).
                add(BigInteger.valueOf(second).multiply(smax)));
        System.out.println(res);
    }
}
