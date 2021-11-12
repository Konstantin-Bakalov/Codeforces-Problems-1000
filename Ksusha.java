import java.util.Arrays;
import java.util.Scanner;

// codeforces.com/contest/299/problem/A

public class Ksusha {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n =  s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) a[i] = s.nextInt();
        Arrays.sort(a);
        int k = a[0];
        for(int i = 1; i < n; i++) {
            if(a[i] % k != 0) {
                k = -1;
                break;
            }
        }
        System.out.println(k);
    }
}