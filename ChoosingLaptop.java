import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/contest/106/problem/B

public class ChoosingLaptop {

    public static boolean in(ArrayList<Integer> list, int index) {
        for(int i = 0; i < list.size(); i++) {
            if(index == list.get(i)) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] a = new int[n][5];
        ArrayList<Integer> list = new ArrayList<>();
        boolean b = false;
        int min = Integer.MAX_VALUE, index = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < 4; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for(int i = 0; i < n; i++) {
            for(int k = 0; k < n; k++) {
                if(i != k && a[i][0] < a[k][0] && a[i][1] < a[k][1] && a[i][2] < a[k][2]) {
                    a[i][4] = 1;
                    break;
                }
            }
        }
        for(int i = 0; i < n; i++) {
            if(a[i][4] != 1 && a[i][3] < min) {
                min = a[i][3];
                index = i;
            }
        }
        System.out.println(index + 1);
 }
}