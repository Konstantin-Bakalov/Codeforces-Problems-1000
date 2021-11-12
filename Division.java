import java.util.Scanner;
 
public class Division {
 
    public static boolean lucky(int number) {
        int digit = 0;
        while(number > 1) {
            digit = number % 10;
            number /= 10;
            if(digit != 4 && digit != 7) return false;
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        boolean b = false;
        for(int i = 2; i <= 1000; i++) {
            if(lucky(i) && n % i == 0) b = true;
        }
        if(b) System.out.println("YES");
        else System.out.println("NO");
    }
}