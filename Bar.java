import java.util.Arrays;
import java.util.Scanner;

// codeforces.com/contest/56/problem/A

public class Bar {

    public static boolean under18(String s) {
        if(s.length() == 1) return true;
        else if(s.length() == 2 && s.charAt(0) == '1') {
            if(s.charAt(1) >= '0' && s.charAt(1) <= '7') return true;
            else return false;
        }
        else return false;
    }

    public static boolean isAlk(String s, String[] b) {
        for(int i = 0; i < b.length; i++) {
            if(s.equals(b[i])) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = 0;
        String[] a = new String[n];
        String[] b = {"ABSINTH", "BEER", "BRANDY", "CHAMPAGNE", "GIN", "RUM", "SAKE", "TEQUILA", "VODKA", "WHISKEY", "WINE"};
        for(int i = 0; i < a.length; i++) a[i] = s.next();
        for(int i = 0; i < a.length; i++) {
            if(a[i].charAt(0) >= '0' && a[i].charAt(0) <= '9' && under18(a[i])) k++;
            else if(isAlk(a[i], b)) k++;
        }
        System.out.println(k);
        //System.out.println(under18("120"));
    }
}