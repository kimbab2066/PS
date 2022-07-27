package BOJ.DP;

import java.io.*;
import java.util.*;

public class P11053 {
	static int N;
	static int MIN = Integer.MAX_VALUE;
	static int arr[], DP[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		arr = new int[N + 1];
		DP = new int[N + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		// value in arr
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		// MIN update
		int idx = 0;
		for (int i = 1; i <= N; i++) {
			if (MIN > arr[i]) {
				MIN = arr[i];
				idx = i;
			}
		}
		for (int i = idx + 1; i <= N; i++) {
			for (int j = i + 1; j <= N; j++) {
				if (arr[i] < arr[j]) {
					DP[i] = arr[i];
				}
			}
		}
		System.out.println(DP[N]);
	}// end of main
}// end of class