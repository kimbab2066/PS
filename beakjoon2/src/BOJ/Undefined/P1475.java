package BOJ.Undefined;

import java.util.Scanner;

public class P1475 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int cnt = 0;
		int[] freq = new int[10];
		while (N != 0) {
			freq[N % 10]++;
			N /= 10;
		}
		for (int i = 0; i < 10; i++) {
			if (i == 6 || i == 9) continue;
			cnt = Math.max(cnt, freq[i]);
		}
		cnt = Math.max(cnt, (freq[6] + freq[9] + 1) / 2);
		System.out.println(cnt);

	}// main
}// class
