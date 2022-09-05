package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P13398 {
	public static void main(String[] args) throws IOException {
		/*
		 * n개의 정수로 이루어진 임의의 수열이 주어지고 이 중 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다.
		 * 
		 * 단, 수는 한 개 이상 선택해야 한다.또, 수열에서 수를 하나 제거할 수 있다. (제거하지 않아도 된다)
		 * 
		 * 첫째 줄에 정수 n(1 ≤ n ≤ 100,000)이 주어지고 둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다.
		 * 
		 * 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.
		 * 
		 * 첫째 줄에 답을 출력한다.
		 * 
		 * 점화식
		 * 
		 * DP[i][0] = Math.max(DP[i-1][0]+val[i],val[i])
		 * 
		 * DP[i][1] = Math.max(DP[i-1][0],val[i-1][0]+val[i])
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int val[] = new int[N];
		int DP[][] = new int[N][2];
		StringTokenizer st = new StringTokenizer(br.readLine());
		// value in val
		for (int i = 0; i < N; i++) {
			val[i] = Integer.valueOf(st.nextToken());
		}
		int result = DP[0][0] = DP[0][1] = val[0];
		// Bottom-Up
		for (int i = 1; i < N; i++) {
			DP[i][0] = Math.max(DP[i - 1][0] + val[i], val[i]);// 제거 x
			DP[i][1] = Math.max(DP[i - 1][0], DP[i - 1][1] + val[i]);// 제거
			result = Math.max(result, Math.max(DP[i][0], DP[i][1]));
		}
		System.out.println(result);

	}// end of main
}// end of class