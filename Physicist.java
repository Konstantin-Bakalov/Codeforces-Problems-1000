import java.util.*;

// codeforces.com/contest/69/problem/A
 
public class Physicist {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][3];
        int one = 0, two = 0, three = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 3; j++) {
                a[i][j] = s.nextInt();
                if(j == 0) one += a[i][j];
                else if(j == 1) two += a[i][j];
                else three += a[i][j];
            }
        }
        if(one == 0 && two == 0 && three == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}
