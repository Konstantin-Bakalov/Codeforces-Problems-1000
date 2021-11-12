import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

// codeforces.com/contest/456/problem/A

public class Laptops {

    private static class Pair {
        public Integer price;
        public Integer performance;

        public Pair(Integer p, Integer per) {
            this.price = p;
            this.performance = per;
        }
    }

    private static class MyComparator implements Comparator<Pair> {

        public int compare(Pair a, Pair b) {
            if(a.price < b.price) return -1;
            if(a.price > b.price) return 1;
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Pair[] list = new Pair[n];
        boolean b = false;
        for(int i = 0; i < n; i++) {
            int price = s.nextInt();
            int perf = s.nextInt();
            list[i] = new Pair(price, perf);
        }
        Arrays.sort(list, new MyComparator());
        for(int i = 0; i < n - 1; i++) {
            if(list[i].performance > list[i + 1].performance) {
                b = true;
                break;
            }
        }
        if(b) System.out.println("Happy Alex");
        else System.out.println("Poor Alex");
    }
}