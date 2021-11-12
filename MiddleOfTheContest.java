import java.util.Scanner;

// codeforces.com/contest/1133/problem/A
 
public class MiddleOfTheContest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String one = s.next();
        String two = s.next();
        int h1 = ((int)one.charAt(0) - 48) * 10 + ((int)one.charAt(1) - 48);
        int m1 = ((int)one.charAt(3) - 48) * 10 + ((int)one.charAt(4) - 48);
        int h2 = ((int)two.charAt(0) - 48) * 10 + ((int)two.charAt(1) - 48);
        int m2 = ((int)two.charAt(3) - 48) * 10 + ((int)two.charAt(4) - 48);
        int time = (h2 - h1) * 60 + (m2 - m1);
        time /= 2;
        m1 += time;
        while(m1 >= 60) {
            m1 -= 60;
            h1++;
        }
        if(h1 < 10) System.out.print("0" + h1 + ":");
        else System.out.print(h1 + ":");
        if(m1 < 10) System.out.print("0" + m1);
        else System.out.print(m1);
    }
}