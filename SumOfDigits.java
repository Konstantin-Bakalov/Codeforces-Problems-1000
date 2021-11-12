import java.util.Scanner;

// codeforces.com/contest/102/problem/B
 
public class SumOfDigits {
 
    public static int sum(String str) {
        int sum = 0;
        for(int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - 48;
        }
        return sum;
    }
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int br = 0;
        if(str.length() >= 2) br++;
        while(sum(str) >= 10) {
            str = sum(str) + "";
            br++;
        }
        System.out.println(br);
    }
}