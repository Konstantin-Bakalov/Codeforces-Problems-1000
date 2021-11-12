import java.util.Scanner;

// codeforces.com/contest/272/problem/A

public class DimaAndFriends {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        int res = 0, sum = 0;
        for(int i = 0; i < n; i++) sum += a[i];
        for(int i = 1; i <= 5; i++) {
            if((sum + i) % (n + 1) != 1) {
                res++;
            }
        }
        System.out.println(res);
    }
}