import java.util.Scanner;

// codeforces.com/contest/268/problem/B
 
public class Buttons {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int res = 0;
        for(int i = 1; i <= n; i++) {
            res += (n - i) * i;
        }
        res += n;
        System.out.println(res);
    }
}