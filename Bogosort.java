import java.util.Arrays;
import java.util.Scanner;

// codeforces.com/contest/1312/problem/B
 
public class Bogosort {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int n;
        for(int k = 0; k < t; k++) {
            n = s.nextInt();
            int[] a = new int[n];
            for(int i = 0; i < a.length; i++) a[i] = s.nextInt();
            Arrays.sort(a);
            for(int i = a.length - 1; i >=0; i--) System.out.print(a[i] + " ");
            System.out.println("");
        }
    }
}