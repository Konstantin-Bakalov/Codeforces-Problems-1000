import java.util.Scanner;

// codeforces.com/contest/909/problem/A

public class GenerateLogin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String res = "";
         int i = 0, j = 0;
         for(int k = 0; k < str.length(); k++) {
             if(str.charAt(k) == ' ') j = k + 1;
         }
         res += str.charAt(i);
         i = 1;
         while(i < j - 1 && (int)str.charAt(i) < (int)str.charAt(j)) {
             res += str.charAt(i);
             i++;
         }
         res += str.charAt(j);
        System.out.println(res);
    }
}