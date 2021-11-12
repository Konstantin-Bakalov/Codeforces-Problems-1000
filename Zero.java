import java.math.BigInteger;
import java.util.Scanner;

// codeforces.com/contest/1342/problem/A
 
public class Zero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        BigInteger x, y, a, b, res;
        for(int i = 1; i <= t; i++) {
            x = s.nextBigInteger();
            y = s.nextBigInteger();
            a = s.nextBigInteger();
            b = s.nextBigInteger();
            if(x.compareTo(y) > 0) {
                BigInteger temp = x;
                x = y;
                y = temp;
            }
            BigInteger c = a.multiply(new BigInteger("2"));
            if(c.compareTo(b) < 0) res = a.multiply(x.add(y));
            else res = b.multiply(x).add(a.multiply((y.subtract(x))));
            System.out.println(res);
        }
    }
}