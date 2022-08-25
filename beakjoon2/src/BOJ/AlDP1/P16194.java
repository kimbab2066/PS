package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P16194 {

	public static void main(String[] args) throws IOException {
		/*
		 * 카드 팩의 가격이 주어졌을 때, N개의 카드를 구매하기 위해 민규가 지불해야 하는 금액의 최솟값을 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 민규가 구매하려고 하는 카드의 개수 N이 주어진다. (1 ≤ N ≤ 1,000)
		 * 
		 * 둘째 줄에는 Pi가 P1부터 PN까지 순서대로 주어진다. (1 ≤ Pi ≤ 10,000)
		 * 
		 * 첫째 줄에 민규가 카드 N개를 갖기 위해 지불해야 하는 금액의 최솟값을 출력한다.
		 * 
		 * 점화식 DP[i] = min(DP[i], DP[i - j] + cost[j])
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int cost[] = new int[N + 1];// 비용
		int DP[] = new int[N + 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		// value in cost
		for (int i = 1; i <= N; i++) {
			cost[i] = Integer.valueOf(st.nextToken());
		}

		for (int i = 1; i <= N; i++) {
			DP[i] = cost[i];// 초기화 필수!
			for (int j = 1; j <= i; j++) {
				DP[i] = Math.min(DP[i], DP[i - j] + cost[j]);
			}
		}
		System.out.println(DP[N]);
	}// end of main
}// end of class