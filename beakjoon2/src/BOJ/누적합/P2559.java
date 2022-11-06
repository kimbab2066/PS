package BOJ.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2559 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int K = Integer.valueOf(st.nextToken());

		int[] arr = new int[N + 1];

		st = new StringTokenizer(br.readLine());
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}

		int T = N - K + 1;
		int arr2[] = new int[T + 1];
		int max = Integer.MIN_VALUE;
		for (int i = 1; i <= T; i++) {
			for (int j = i; j < i + K; j++) {
				arr2[i] += arr[j];
			}
			max = Math.max(max, arr2[i]);
		}
		System.out.println(max);
	}// end of main
}// end of class
