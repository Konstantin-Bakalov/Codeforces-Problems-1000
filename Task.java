import java.util.*;

// codeforces.com/contest/118/problem/A
 
public class Task {
 
    public static boolean isVowel(char c) {
        if(c == 'a' || c == 'A' || c == 'o' || c == 'O' || c == 'y' || c == 'Y'
        || c == 'e' || c == 'E' || c == 'u' || c == 'U' || c == 'i' || c == 'I') return true;
        return false;
    }
 
    public static boolean isConsonant(char c) {
        return !isVowel(c);
    }
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str= s.next();
        String res = "";
        for(int i = 0; i < str.length(); i++) {
            if(Task.isConsonant(str.charAt(i))) {
                if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') res += "." + (char)(str.charAt(i) + ' ');
                else res += "." + (char)str.charAt(i);
            }
        }
        System.out.println(res);
    }
}