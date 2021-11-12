import java.util.Scanner;

// codeforces.com/contest/577/problem/A
 
public class Table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int x = s.nextInt();
        int res = 0;
        int lim = x > n ? n : x;
        int i = x > n ? 2 : 1;
        for(; i <= lim; i++) {
                if(x % i == 0 && x / i <= n) res++;
        }
        System.out.println(res);
    }
}