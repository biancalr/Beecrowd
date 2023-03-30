package ad_hoc;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Bee_1030_FlaviousJosephus {

	public static void main(String[] args) {
		
		int nc;
		Scanner input = new Scanner(System.in);
		
		nc = input.nextInt();
		
		for (int i = 1; i < nc + 1; i++) {
			
			int n = input.nextInt();
			int k = input.nextInt();
			
			int m = josephus(n, k);
			System.out.println("Case "+i + ": " + m);
		}
		
	}

	private static int josephus(int n, int k) {
		List<Integer> b = new LinkedList<>();
		
		for (int j = 1; j <= n; j++) {
			b.add(j);
		}
		
		int m = 0;
		
		while (!b.isEmpty()) {
			for (int j = 0; j < k - 1; j++) {
				b.add(b.remove(0));
			}
			m=b.get(0);
			b.remove(b.get(0));
		}
		return m;
	}

}
