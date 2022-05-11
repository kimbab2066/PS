package baekjoon2.Array;

import java.util.Scanner;

public class P2577_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();

		int val = A * B * C;

		int[] arr = new int[10];

		// 17037300

		String str = String.valueOf(val);

		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i) - '0']++;
		}
		for (int v : arr) {
			System.out.println(v);
		}

	}// end of main
}// end of class
