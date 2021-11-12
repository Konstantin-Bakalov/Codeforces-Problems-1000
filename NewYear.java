import java.util.Scanner;

// codeforces.com/contest/379/problem/A
 
public class NewYear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int ans = 0, rest = 0;
        while (a > 0) {
            ans += a;
            rest += a % b;
            a /= b;
            if(rest >= b) {
                a += rest / b;
                rest = rest % b;
            }
        }
        System.out.println(ans);
    }
}
