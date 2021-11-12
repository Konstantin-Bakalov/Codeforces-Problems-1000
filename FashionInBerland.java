import java.util.Scanner;

// codeforces.com/contest/691/problem/A

public class FashionInBerland {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++) a[i] = s.nextInt();
        int zeros = 0, ones = 0;
        if(n == 1 && a[0] == 1) System.out.println("YES");
        else if(n == 1 && a[0] == 0) System.out.println("NO");
        else {
            for(int i = 0; i < a.length; i++) {
                if(a[i] == 0) zeros++;
                if(a[i] == 1) ones++;
                if(zeros == 2) break;
            }
            if(zeros == 2 || ones == a.length) System.out.println("NO");
            else System.out.println("YES");
        }
    }
}