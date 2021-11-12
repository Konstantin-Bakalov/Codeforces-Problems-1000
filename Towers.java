import java.util.Arrays;
import java.util.Scanner;

// codeforces.com/contest/37/problem/A
 
public class Towers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int br = 1, h = 1, max = 1;
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++) a[i] = s.nextInt();
        Arrays.sort(a);
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] != a[i + 1]) br++;
        }
        for(int i = 0; i < a.length - 1; i++) {
            if(a[i] == a[i + 1]) h++;
            else h = 1;
            if(max < h) max = h;
        }
        System.out.println(max + " " + br);
    }
}