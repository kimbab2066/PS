package BOJ.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class P2108 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int[] freq = new int[8001];
		double sum = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		int med = 4001, mode = 4001;
		// value in freq
		for (int i = 0; i < N; i++) {
			int val = Integer.valueOf(br.readLine());
			sum += val;
			freq[val + 4000]++;
			if (max < val) max = val;
			if (min > val) min = val;
		}
		//
		int cnt = 0;
		int mode_max = 0;
		boolean flag = false;
		// 카운팅 배열에서 4000을 더했기 때문
		for (int i = min + 4000; i <= max + 4000; i++) {
			if (freq[i] > 0) {
				// 중앙값 (예를 들어 N = 5인 경우 2가 되야 한다는 소리)
				if (cnt < (N + 1) / 2) {
					cnt += freq[i];
					med = i - 4000;
				}
				// 빈도수가 높은 경우
				if (mode_max < freq[i]) {
					mode_max = freq[i];
					mode = i - 4000;
					flag = true;
				}
				// 중복 체크
				else if (mode_max == freq[i] && flag == true) {
					mode = i - 4000;
					flag = false;
				}
			}
		}
		// 평균
		System.out.println(Math.round(sum / N));
		// 중앙값
		System.out.println(med);
		// 최빈값
		System.out.println(mode);
		// 범위
		System.out.println(max - min);
	}// end of main
}// end of class
