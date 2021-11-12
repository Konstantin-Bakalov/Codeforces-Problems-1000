import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/contest/435/problem/A

public class QueueBusStop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int index = 0, res = 0;
        ArrayList<Integer> a = new ArrayList<>();
        for(int i = 0; i < n; i++) a.add(s.nextInt());
        while(!a.isEmpty()) {
            int sum = 0;
            index = 0;
            while(index < a.size() && sum + a.get(index) <= m) {
                sum += a.get(index);
                a.remove(index);
                //index++;
            }
            res++;
        }
        System.out.println(res);
    }
}