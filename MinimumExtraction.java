import java.util.*;

// codeforces.com/contest/1607/problem/C

public class MinimumExtraction {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0) {
			int n = s.nextInt();
			ArrayList<Integer> v = new ArrayList<>();
			for(int i = 0; i < n; i++) v.add(s.nextInt());
			Collections.sort(v);
			int max = v.get(0);
			for(int i = 0; i < n - 1; i++) {
				max = Math.max(max, v.get(i + 1) - v.get(i));
			}
			System.out.println(max);
		}
	}
}