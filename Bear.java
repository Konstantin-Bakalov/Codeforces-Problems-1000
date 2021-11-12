import java.util.Scanner;

// codeforces.com/contest/680/problem/B
 
public class Bear {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a = s.nextInt();
        int[] t = new int[n + 1];
        for(int i = 1; i <= n; i++) t[i] = s.nextInt();
        int res = 0;
        for(int j = 0; j <= n; j++) {
            if(a + j <= n && a - j >= 1) {
                if(t[a + j] == 1 && t[a - j] == 1 && j == 0) res += 1;
                else if(t[a + j] == 1 && t[a - j] == 1) res += 2;
            }
            else if(a + j <= n && a - j < 1) {
                if(t[a + j] == 1) res++;
            }
            else if(a - j >= 1 && a + j > n) {
                if(t[a - j] == 1) res++;
            }
        }
        System.out.println(res);
    }
}