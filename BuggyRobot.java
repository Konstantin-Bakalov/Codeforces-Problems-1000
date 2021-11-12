import java.util.Arrays;
import java.util.Scanner;

// codeforces.com/contest/888/problem/B

public class BuggyRobot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String str = s.next();
        int left = 0, right = 0, up = 0, down = 0;
        int max = 0;
        int br1 = 0, br2 = 0;
        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'L') left++;
            if(str.charAt(i) == 'R') right++;
            if(str.charAt(i) == 'U') up++;
            if(str.charAt(i) == 'D') down++;
        }
        //System.out.println(left + " " + right + " " + up + " " + down);
        while(left >= 1 && right >= 1 && up >= 1 && down >= 1) {
            max += 4;
            left--;
            right--;
            up--;
            down--;
        }
        while(left >= 1 && right >= 1 && (up == 0 || down == 0)) {
            max += 2;
            left--;
            right--;
        }
        while(up >= 1 && down >= 1 && (left == 0 || right == 0)) {
            max += 2;
            up--;
            down--;
        }
        //System.out.println(br1 + " " + br2);
        System.out.println(max);
    }
}