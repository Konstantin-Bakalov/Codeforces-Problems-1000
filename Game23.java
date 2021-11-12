import java.util.Scanner;

// codeforces.com/contest/1141/problem/A
 
public class Game23 {
 
    public static boolean pure(int m) {
        while(m > 1) {
            if(m % 2 != 0 && m % 3 != 0) return false;
            if(m % 2 == 0) m /= 2;
            else if(m % 3 == 0) m /= 3;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        int moves = 0;
        if(!pure(m / n)) moves = -1;
        else if(m % n != 0) moves = -1;
        else {
            int value = m / n;
            while(value % 2 == 0) {
                moves++;
                value /= 2;
            }
            while(value % 3 == 0) {
                moves++;
                value /= 3;
            }
        }
        System.out.println(moves);
    }
}