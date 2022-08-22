package BOJ.AlDP1;

import java.io.*;
import java.util.*;

public class P11726 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 2xN 크기의 직사각형을 타일로 채우는 경우의 수를 찾아라.
		int N = Integer.valueOf(br.readLine());
		int DP[] = new int[1001];
		DP[1] = 1;
		DP[2] = 2;

		for (int i = 3; i <= N; i++) {
			DP[i] = (DP[i - 1] + DP[i - 2]) % 10007;
		}
		// 경우의 수에서 10007로 나눈 값을 출력해라.
		System.out.println(DP[N] % 10007);
	}// end of main
}// end of class