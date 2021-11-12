import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

// codeforces.com/contest/1/problem/A

public class Theatre {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        BigInteger n = s.nextBigInteger();
        BigInteger m = s.nextBigInteger();
        BigInteger a = s.nextBigInteger();
        BigInteger res = BigInteger.ZERO;
        if(n.intValue() % a.intValue() == 0) {
            n = n.divide(a);
        }
        else {
            n = n.divide(a).add(BigInteger.ONE);
        }
        if(m.intValue() % a.intValue() == 0) {
            m = m.divide(a);
        }
        else {
            m = m.divide(a).add(BigInteger.ONE);
        }
        res = n.multiply(m);
        System.out.println(res);
    }
}