import java.util.ArrayList;
import java.util.Scanner;

// codeforces.com/contest/43/problem/A
 
public class Fball {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), score1 = 0, score2 = 0;
        String info;
        String team1 = "", team2 = "";
        info = s.next();
        team1 = info;
        score1++;
        for(int i = 0; i < n - 1; i++) {
            info = s.next();
            if(team1.equals(info)) score1++;
            else {
                team2 = info;
                score2++;
            }
        }
        if(score1 > score2) System.out.println(team1);
        else System.out.println(team2);
    }
}