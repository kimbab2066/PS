package BOJ.DP;

import java.io.*;
import java.util.*;

public class P1904_5 {
	static int DP[] = new int[1000001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());

		DP[0] = 0;
		DP[1] = 1;
		DP[2] = 2;
		for (int i = 3; i <= N; i++) {
			DP[i] = (DP[i - 1] + DP[i - 2]) % 15746;
		}
		System.out.println(DP[N]);
	}// end of main
}// end of class
//결국 점화식은 f(n) = f(n-1) + f(n-2)