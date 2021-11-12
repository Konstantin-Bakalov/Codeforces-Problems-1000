import java.util.Scanner;

// codeforces.com/contest/1073/problem/A

public class DiverseSubstring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        boolean b = false;
        String res = "";
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) != str.charAt(i + 1)) {
                b = true;
                res += str.charAt(i);
                res += str.charAt(i + 1);
                break;
            }
        }
        if(b) {
            System.out.println("YES");
            System.out.println(res);
        }
        else System.out.println("NO");
    }
}