package BOJ.Undefined;

import java.util.Scanner;

public class P2440 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N - i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}// end of main
}// end of class
