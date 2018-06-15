package janlong;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int T = scn.nextInt();

		int t = 1;
		while (t <= T) {
			int a = scn.nextInt();
			int b = scn.nextInt();
			int c = scn.nextInt();
			int d = scn.nextInt();

			if (a == b) {
				if (c == d) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else if (a == c) {
				if (b == d) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else if (a == d) {
				if (b == c) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			} else {
				System.out.println("NO");
			}

			t++;
		}
	}

}
