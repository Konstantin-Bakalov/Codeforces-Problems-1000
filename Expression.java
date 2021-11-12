import java.util.Arrays;
import java.util.Scanner;

// codeforces.com/contest/479/problem/A
 
public class Expression {
 
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int[] array = new int[4];
        array[0] = a + b + c;
        array[1] = a * b * c;
        array[2] = (a + b) * c;
        array[3] = a * (b + c);
        Arrays.sort(array);
        System.out.println(array[array.length - 1]);
    }
}