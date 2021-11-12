import java.util.Scanner;

// codeforces.com/contest/131/problem/A
 
public class CapsLock {
 
    public static boolean allUppercase(String str) {
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') return false;
        }
        return true;
    }
 
    public static boolean restUppercase(String str) {
        for(int i = 0; i < str.length(); i++) {
            if( i == 0 && str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') return false;
            if(i != 0 && str.charAt(i) >= 'a' && str.charAt(i) <= 'z') return false;
        }
        return true;
    }
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        if(restUppercase(str)) {
            str = str.toLowerCase();
            char[] array = str.toCharArray();
            array[0] = (char) (array[0] - ' ');
            System.out.println(array);
        }
        else if(allUppercase(str)) {
            str = str.toLowerCase();
            System.out.println(str);
        }
        else System.out.println(str);
    }
}