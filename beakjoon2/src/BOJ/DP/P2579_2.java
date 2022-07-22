package BOJ.DP;

import java.io.*;
import java.util.*;

public class P2579_2 {
	static int N;
	static int arr[];
	static int DP[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = new int[N + 1];
		DP = new int[N + 1];

		// value in arr
		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		// 첫번째 계단 값
		DP[1] = arr[1];
		
		// N이 1인 경우도 존재할 수 있다.
		if (N >= 2) DP[2] = arr[1] + arr[2];

		//바로 직전 단계인 i-1의 경우, 알 수 없는 상태이기에 이미 입력된 arr배열을 통해 호출한다
		for (int i = 3; i <= N; i++) {
			DP[i] = Math.max(DP[i - 2], DP[i - 3] + arr[i - 1]) + arr[i];
		}
		System.out.println(DP[N]);

	}// end of main
}// end of class