package BOJ.AlDP1;

import java.io.*;
import java.util.*;
	
//Bottom-Up
public class P1463_2 {
	static Integer DP[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		DP = new Integer[N + 1];
		DP[0] = DP[1] = 0;

		for (int i = 2; i <= N; i++) {
			DP[i] = DP[i - 1] + 1;
			if (i % 2 == 0) DP[i] = Math.min(DP[i], DP[i / 2] + 1);
			if (i % 3 == 0) DP[i] = Math.min(DP[i], DP[i / 3] + 1);
		}
		System.out.println(DP[N]);
	}// end of main
}// end of class