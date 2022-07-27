package BOJ.DP;

import java.io.*;

public class P11053_4 {
	static int N;
	static int arr[], DP[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		String str[] = br.readLine().split(" ");
		arr = new int[N];
		DP = new int[N];

		// value in arr
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(str[i]);
		}

		for (int i = 0; i < N; i++) {
			DP[i] = 1;
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && DP[i] < DP[j] + 1) {
					DP[i] = DP[j] + 1;
				}
			}
		}
		int max = -1;
		for (int i = 0; i < N; i++) {
			max = max > DP[i] ? max : DP[i];
		}
		System.out.println(max);
	}// end of main
}// end of class