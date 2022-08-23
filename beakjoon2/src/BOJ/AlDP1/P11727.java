package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P11727 {

	public static void main(String[] args) throws IOException {
		/*
		 * 2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
		 * 
		 * 점화식 DP[N] = DP[N-1] + 2*DP[N-2]
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int DP[] = new int[1001];
		DP[1] = 1;
		DP[2] = 3;
		for (int i = 3; i <= N; i++) {
			DP[i] = (DP[i - 1] + 2 * DP[i - 2]) % 10007;
		}
		System.out.println(DP[N]);
	}// end of main
}// end of class