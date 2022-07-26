package BOJ.DP;

import java.io.*;

public class P2156_2 {
	static int N;
	static int arr[];
	static Integer DP[];
	// Bottom-up

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = new int[N + 1];
		DP = new Integer[N + 1];
		// value in arr
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		DP[0] = arr[0] = 0;// Integer배열인 경우에 한해서 0으로 초기화 int배열은 안해도 됨
		DP[1] = arr[1];
		if (N > 1) {
			DP[2] = arr[1] + arr[2];
		}

		for (int i = 3; i <= N; i++) {
			DP[i] = Math.max(Math.max(DP[i - 2] + arr[i], DP[i - 3] + arr[i - 1] + arr[i]), DP[i - 1]);
		}
		System.out.println(DP[N]);
	}// end of main
}
// end of class