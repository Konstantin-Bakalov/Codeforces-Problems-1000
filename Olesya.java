import java.util.Random;
import java.util.Scanner;

// codeforces.com/contest/584/problem/A
 
public class Olesya {
 
    public static int sum(int[] a) {
        int res = 0;
        for(int i : a) res += i;
        return res;
    }
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        int n = s.nextInt();
        int t = s.nextInt();
        int[] a = new int[n];
        /*if(t == 2) {
            for(int i = 0; i < a.length - 1; i++) {
                a[i] = r.nextInt(10);
            }
            a[a.length - 1] = 0;
        }
        else if(t == 3) {
            for(int i = 0; i < a.length; i++) a[i] = 3;
        }
        else if(t == 4) {
            for(int i = 0; i < a.length - 2; i++) a[i] = r.nextInt(10);
            a[a.length - 2] = 2;
            a[a.length - 1] = 4;
        }
        else if(t == 5) {
            for(int i = 0; i < a.length - 1; i++) a[i] = r.nextInt(10);
            a[a.length - 1] = 5;
        }
        else if(t == 6) {
            for(int i = 0; i < a.length - 2; i++) a[i] = 3;
            a[a.length - 2] = 4;
            a[a.length - 1] = 2;
        }
        else if(t == 7) {
            for(int i = 0; i < a.length; i++) a[i] = 7;
        }
        */
        if(n == 1 && t == 10) System.out.println(-1);
        else {
            if(t == 10) {
                for(int i = 0; i < a.length - 1; i++) a[i] = 1;
                a[a.length - 1] = 0;
            }
            else for (int i = 0; i < a.length; i++) a[i] = t;
            for (int i = 0; i < a.length; i++) System.out.print(a[i]);
        }
    }
}
