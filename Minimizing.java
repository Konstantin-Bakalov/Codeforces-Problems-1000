import java.util.Scanner;

// codeforces.com/contest/1230/problem/B
 
public class Minimizing {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        String arr = s.next();
        char[] S = arr.toCharArray();
        int br = 0;
        if(S.length == 1 && k >= 1) S[0] = '0';
        else {
            for (int i = 0; i < S.length; i++) {
                if (br == k) break;
                if (i == 0 && S[i] != '1') {
                    S[i] = '1';
                    br++;
                } else if (i > 0 && S[i] != '0') {
                    S[i] = '0';
                    br++;
                }
            }
        }
        for(int i = 0; i < S.length; i++) System.out.print(S[i]);
    }
}