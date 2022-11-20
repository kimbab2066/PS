package BOJ.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2108_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int[] arr = new int[8001];
		double sum = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			int val = Integer.valueOf(br.readLine());
			sum += val;
			arr[val + 4000]++;
			if (max < val) max = val;
			if (min > val) min = val;
		}
		int median = 4001, mode = 4001;
		// 카운트하고 최빈값을 찾아야 함
		int cnt = 0, mode_max = 0;
		boolean flag = false;
		for (int i = min + 4000; i <= max + 4000; i++) {
			// 값이 존재할 때
			if (arr[i] > 0) {
				// 중앙값
				if (cnt < (N + 1) / 2) {
					cnt += arr[i];
					median = i - 4000;
				}
				if (mode_max < arr[i]) {
					mode_max = arr[i];
					mode = i - 4000;
					flag = true;
				} else if (flag && mode_max == arr[i]) {
					mode = i - 4000;
					flag = false;
				}
			}
		}
		// 평균
		System.out.println(Math.round(sum / N));
		// 중앙값
		System.out.println(median);
		// 최빈값
		System.out.println(mode);
		// 범위
		System.out.println(max - min);
	}// end of main
}// end of class