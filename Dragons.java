import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Scanner;

// codeforces.com/contest/230/problem/A
 
public class Dragons {
 
    public static int minIndex(LinkedList<Integer> x) {
        int min = Integer.MAX_VALUE, index = 0;
        for(int i = 0; i < x.size(); i++) {
            if (x.get(i) < min) {
                min = x.get(i);
                index = i;
            }
        }
        return index;
    }
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int n = sc.nextInt();
        LinkedList<Integer> x = new LinkedList<>();
        LinkedList<Integer> y = new LinkedList<>();
        for(int i = 0; i < n; i++) {
            x.add(sc.nextInt());
            y.add(sc.nextInt());
        }
        while(x.size() != 0) {
            int index = minIndex(x);
            if(s > x.get(index)) {
                s += y.get(index);
                x.remove(index);
                y.remove(index);
            }
            else break;
        }
        if(x.size() == 0) System.out.println("YES");
        else System.out.println("NO");
    }
}