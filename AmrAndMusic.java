import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// codeforces.com/contest/507/problem/A
 
public class AmrAndMusic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] a = new int[n + 1];
        int res = 0, days = 0, index = 0;
        ArrayList<Integer> list = new ArrayList();
        for(int i = 1; i <= n; i++) a[i] = s.nextInt();
        for(int i = 1; i <= n; i++) {
            int min = Integer.MAX_VALUE;
            for(int j = 1; j <= n; j++) {
                if(a[j] < min) {
                    min = a[j];
                    index = j;
                }
            }
            a[index] = Integer.MAX_VALUE;
            if(days + min <= k) {
                days += min;
                list.add(index);
                res++;
            }
            index = 0;
        }
        System.out.println(res);
        for(int i = 0; i < list.size(); i++) System.out.print(list.get(i) + " ");
    }
}