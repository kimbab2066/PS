package BOJ.DP;

import java.io.*;
import java.util.*;

public class P9461_2 {
	static int arr[] = new int[101];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (T-- > 0) {
			int N = Integer.valueOf(br.readLine());
			sb.append(padovan(N)).append("\n");
		} // end of while
		System.out.println(sb);
	}// end of main

	static long padovan(int N) {
		arr[1] = arr[2] = arr[3] = 1;
		for (int i = 4; i <= N; i++) {
			arr[i] = arr[i - 2] + arr[i - 3];
		}
		return arr[N];
	}// end of padovan
}// end of class
//점화식 f(n) = f(n-2) + f(n-3);