package BOJ.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P1934 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while (T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.valueOf(st.nextToken());
			int B = Integer.valueOf(st.nextToken());
			sb.append(LCM(A, B) + "\n");

		} // end of while
		System.out.println(sb);
	}// end of main

	static int GCD(int a, int b) {
		if (b == 0) return a;
		else return GCD(b, a % b);
	}

	//b = 0, A = GCD
	static int GCD2(int a, int b) {
		while (b > 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}

	static int LCM(int a, int b) {
		return a * b / GCD(a, b);
	}
}// end of class
