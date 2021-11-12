import java.util.Scanner;

// codeforces.com/contest/237/problem/A

public class FreeCash {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][2];
        int res = 1, j = 0, max = 0;
        for(int i = 0; i < a.length; i++) {
            a[i][0] = s.nextInt();
            a[i][1] = s.nextInt();
        }
        for(int i = 0; i < a.length; i++) {
            while(i < a.length - 1 && a[i][0] == a[i + 1][0] && a[i][1] == a[i + 1][1]) {
                res++;
                i++;
            }
            if(res > max) max = res;
            res = 1;
        }
        System.out.println(max);
    }
}