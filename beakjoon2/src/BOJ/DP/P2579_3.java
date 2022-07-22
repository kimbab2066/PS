package BOJ.DP;

import java.io.*;
import java.util.*;

public class P2579_3 {
	static int N;
	static int arr[];
	static Integer DP[]; // default value is null

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = new int[N + 1];
		DP = new Integer[N + 1];
		// value in arr
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		DP[0] = arr[0];
		DP[1] = arr[1];
		if (N >= 2) {
			DP[2] = arr[1] + arr[2];
		}
		System.out.println(cStair(N));

	}// end of main

	static int cStair(int N) {
		//DP[N]은 2번째 전 계단과 3번째 전 계단 + 직전 계단 중 큰 값을 현재 계단의 값과 더해서 저장한다.
		//직전 계단을 호출하지 않는 이유는 밟은 상태인지 알 수 없기 때문에 기존 입력된 arr배열을 통해 호출한다.
		if (DP[N] == null) {
			DP[N] = Math.max(cStair(N - 2), cStair(N - 3) + arr[N - 1]) + arr[N];
		}
		return DP[N];
	}// end cStarirs

}// end of class
