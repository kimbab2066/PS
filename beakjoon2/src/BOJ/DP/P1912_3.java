package BOJ.DP;

import java.io.*;
import java.util.*;

public class P1912_3 {
	static int arr[];
	static int DP[];
	static int N, MAX;

	// Bottom-Up 방식
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		// array in value
		arr = new int[N];
		DP = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		// MAX, DP 초기화
		MAX = DP[0] = arr[0];
		for (int i = 1; i < N; i++) {
			DP[i] = Math.max(DP[i - 1] + arr[i], arr[i]);
			MAX = Math.max(DP[i], MAX);
		}
		System.out.println(MAX);
	}// end of main
}// end of class