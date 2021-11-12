import java.util.Scanner;

// codeforces.com/contest/139/problem/A
 
public class PetrBook {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[8];
        for(int i = 1; i < a.length; i++) a[i] = s.nextInt();
        int j = 1;
        while(true) {
            n = n - a[j];
            if(n <= 0) {
                System.out.println(j);
                break;
            }
            j++;
            if(j == a.length) j = 1;
        }
    }
}