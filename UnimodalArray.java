import java.util.Scanner;

// codeforces.com/contest/831/problem/A

public class UnimodalArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < a.length; i++) a[i] = s.nextInt();
        int index1, index2;
        for(index1 = 0; index1 < a.length - 1; index1++) {
            if(a[index1] >= a[index1 + 1]) break;
        }
        for(index2 = a.length - 1; index2 > 0; index2--) {
            if(a[index2 - 1] <= a[index2]) break;
        }
        //System.out.println(index1 + " " + index2);
        boolean b = true;
        for(int i = index1; i <= index2 - 1; i++) {
            if(a[i] != a[i + 1]) b = false;
        }
        if(b) System.out.println("YES");
        else System.out.println("NO");
    }
}