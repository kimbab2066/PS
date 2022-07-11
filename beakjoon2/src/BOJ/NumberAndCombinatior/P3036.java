package BOJ.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P3036 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();
		int A = Integer.valueOf(st.nextToken());
		while (st.hasMoreTokens()) {
			int val = Integer.valueOf(st.nextToken());
			int num = GCD(A, val);
			sb.append(A / num + "/" + val / num + "\n");
		} // end of while
		System.out.println(sb);
	}// end of main

	static int GCD(int a, int b) {
		if (b == 0) return a;
		return GCD(b, a % b);
	}
}// end of class