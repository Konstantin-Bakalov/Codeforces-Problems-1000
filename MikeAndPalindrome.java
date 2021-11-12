import java.util.Scanner;

// codeforces.com/contest/798/problem/A

public class MikeAndPalindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        int diff = 0;
        for(int i = 0; i < str.length() / 2; i++) {
            if(str.charAt(i) != str.charAt(str.length() - i - 1)) diff++;
        }
        if(diff == 1 || (diff == 0 && str.length() % 2 == 1)) System.out.println("YES");
        else System.out.println("NO");
    }
}