package baekjoon2.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2231_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int N = Integer.parseInt(str);

		int result = 0;
		for (int i = N - str.length() * 9; i < N; i++) {
			int num = i;
			int sum = 0;

			while (num != 0) {
				sum += num % 10;
				num /= 10;
			}
			if (N == i + sum) {
				result = i;
				break;
			}
		} // end of for
		System.out.println(result);
	}// end of main
}// end of class
