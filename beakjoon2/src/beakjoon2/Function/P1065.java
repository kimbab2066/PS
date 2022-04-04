package beakjoon2.Function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(arithmetic_sequence(Integer.parseInt(br.readLine())));

	}// end of main

	public static int arithmetic_sequence(int num) {
		int cnt = 0;

		if (num < 100)
			return num;
		else {
			cnt = 99;
			if (num == 1000)
				num = 999;

			for (int i = 100; i <= num; i++) {
				int h = i / 100;
				int t = (i / 10) % 10;
				int o = i % 10;

				if ((h - t) == (t - o)) {
					cnt++;
				}
			} // end of for
		} // end of else
		return cnt;
	}// end of arithmetic_sequence
}// end of class
