import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

// codeforces.com/contest/441/problem/A

public class Valera {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int v = s.nextInt();
        LinkedList<int[]> list = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        int k = 0;
        for(int i = 0; i < n; i++) {
            k = s.nextInt();
            int[] a = new int[k];
            for(int j = 0; j < a.length; j++) a[j] = s.nextInt();
            Arrays.sort(a);
            list.add(a);
        }
        for(int i = 0; i < list.size(); i++) {
            int[] a = list.get(i);
            if(a[0] < v) res.add(i + 1);
        }
        System.out.println(res.size());
        for(int i = 0; i < res.size(); i++) System.out.print(res.get(i) + " ");
    }
}