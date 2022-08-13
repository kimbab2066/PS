package BOJ.AIMath2;

import java.io.*;
import java.util.*;

public class P9613 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int T = Integer.valueOf(br.readLine());

		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());
			long arr[] = new long[N];
			long result = 0;
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.valueOf(st.nextToken());
			}
			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					result += gcd(arr[i], arr[j]);
				}
			}
			sb.append(result).append("\n");
		}
		System.out.println(sb);
	}// end of main

	static long gcd(long a, long b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}// end of class