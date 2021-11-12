import java.util.Scanner;

// codeforces.com/contest/450/problem/A
 
public class Jzzhu {
 
    public static boolean allZero(int[] a) {
        for(int i = 1; i < a.length; i++) {
            if (a[i] != 0) return false;
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int index = n;
        int[] a = new int[n + 1];
        for(int i = 1; i < a.length; i++) a[i] = s.nextInt();
        while(!allZero(a)) {
            for (int i = 1; i < a.length; i++) {
                if (a[i] != 0) a[i] -= m;
                if (a[i] <= 0) a[i] = 0;
                if(a[i] >= 1) index = i;
            }
        }
        System.out.println(index);
        //for(int i = 1; i < a.length; i++) System.out.print(a[i] + " ");
    }
}