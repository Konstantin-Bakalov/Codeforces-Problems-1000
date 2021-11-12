import java.util.Scanner;

// codeforces.com/contest/742/problem/A
 
public class Arpa {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if(n == 0) System.out.println(1);
        else if(n % 4 == 1) System.out.println(8);
        else if(n % 4 == 2) System.out.println(4);
        else if(n % 4 == 3) System.out.println(2);
        else System.out.println(6);
    }
}