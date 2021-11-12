import java.util.Scanner;

// codeforces.com/contest/1277/problem/A

public class Polycarp {

    public static boolean beautiful(int number) {
        int p1, p2 = 0;
        if(number >=1 && number <= 9) return true;
        while(number > 1) {
            p1 = number % 10;
            p2 = (number % 100) / 10;
            if(p1 != p2) return false;
            number /= 100;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int n = 0, br = 0;
        for(int k = 0; k < t; k++) {
            n = s.nextInt();
            int b = 0;
            for (int i = 1; i <= 9; i++) {
                b = b * 10 + 1;
                for (int j = 1; j <= 9; j++) {
                    if (b * j <= n) br++;
                }
            }
            System.out.println(br);
            br = 0;
        }
    }
}