package BOJ.자료구조;

import java.util.Arrays;
import java.util.Scanner;

public class P1417 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n == 1) {
			System.out.println(0);
			System.exit(0);
		}
		int[] arr = new int[n - 1];
		int candidate = in.nextInt();
		for (int i = 0; i < n - 1; i++) {
			arr[i] = in.nextInt();
		}
		int cnt = 0;
		while (true) {
			Arrays.sort(arr);
			if (arr[n - 2] < candidate) break;
			cnt++;
			arr[n - 2]--;
			candidate++;
		}
		System.out.println(cnt);
	}// end of main
}// end of class