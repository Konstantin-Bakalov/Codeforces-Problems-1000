import java.util.Scanner;

// codeforces.com/contest/58/problem/A
 
public class Chat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String word = s.next();
        char[] array = word.toCharArray();
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        int i = 0, p = 0;
        boolean b = true;
        char[] result = new char[5];
        for(int j = 0; j < array.length; j++) {
            if(array[j] == 'h' && i == 0) result[i++] = array[j];
            else if(array[j] == 'e' && i == 1) result[i++] = array[j];
            else if(array[j] == 'l' && i == 2) result[i++] = array[j];
            else if(array[j] == 'l' && i == 3) result[i++] = array[j];
            else if(array[j] == 'o' && i == 4) result[i++] = array[j];
        }
        for(int j = 0; j < hello.length; j++) {
            if(hello[j] != result[j]) {
                b = false;
                break;
            }
        }
        if(b) System.out.println("YES");
        else System.out.println("NO");
    }
}