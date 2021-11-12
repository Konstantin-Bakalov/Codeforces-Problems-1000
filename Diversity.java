import java.util.Scanner;

// codeforces.com/contest/844/problem/A

public class Diversity {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int k = s.nextInt();
        int different = 0;
        int[] a = new int[26];
        for(int i = 0; i < str.length(); i++) {
            a[str.charAt(i) - 97]++;
        }
        for(int i = 0; i < a.length; i++) {
            if(a[i] != 0) different++;
        }
        if(str.length() - different >= k - different) {
            if(k - different >= 0) System.out.println(k - different);
            else System.out.println(0);
        }
        else System.out.println("impossible");
    }
}