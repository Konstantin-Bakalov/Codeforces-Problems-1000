import java.util.Scanner;

// codeforces.com/contest/165/problem/A
 
public class SupercentralPoint {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];
        boolean up = false, down = false, left = false, right = false;
        int res = 0;
        for (int i = 0; i < n; i++) {
            x[i] = s.nextInt();
            y[i] = s.nextInt();
        }
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j == i) continue;
                if(x[j] > x[i] && y[j] == y[i]) right = true;
                if(x[j] < x[i] && y[j] == y[i]) left = true;
                if(x[j] == x[i] && y[j] < y[i]) down = true;
                if(x[j] == x[i] && y[j] > y[i]) up = true;
            }
            if(up && down && left && right) res++;
            up = false;
            down = false;
            left = false;
            right = false;
        }
        System.out.println(res);
    }
}