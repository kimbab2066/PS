package baekjoon2.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		// avg,mid,min,range
		int[] arr = new int[8001];

		/*
		 * sum max min mid mode
		 */

		int sum = 0;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int mid = 9999;
		int mode = 9999;

		for (int i = 0; i < N; i++) {
			int val = Integer.parseInt(br.readLine());
			sum += val;
			arr[val + 4000]++;
			if (max < val)
				max = val;
			else if (min > val)
				min = val;
		}

		int cnt = 0;
		int mode_max = 0;

		boolean flag = false;
		for (int i = min + 4000; i <= max + 4000; i++) {
			if (arr[i] > 0) {
				if (cnt < (N + 1) / 2) {
					cnt += arr[i];
					mid = i - 4000;
				}
				if (mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;
				} else if (mode_max == arr[i] && flag == true) {
					mode = i - 4000;
					flag = false;
				}
			}
		}
	}// end of main
}
// end of class
