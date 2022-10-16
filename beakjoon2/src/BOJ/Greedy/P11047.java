package BOJ.Greedy;

import java.util.Scanner;

public class P11047 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int k = in.nextInt();
		int[] arr = new int[n];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}

		for (int i = n - 1; i >= 0; i--) {
			if (k >= arr[i]) {
				cnt += k / arr[i];
				k %= arr[i];
			}
		}
		System.out.println(cnt);

	}// end of main
}// end of class