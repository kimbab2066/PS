package BOJ.NumberAndCombinatior;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1934_2 {
	static int A;
	static int B;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringTokenizer st;

		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			A = Integer.valueOf(st.nextToken());
			B = Integer.valueOf(st.nextToken());
			int val = GCD(A, B);
			sb.append(A * B / val).append("\n");
		}
		System.out.println(sb);
	}// end of main

	static int GCD(int A, int B) {
		while (B != 0) {
			int r = A % B;
			A = B;
			B = r;
		}
		return A;
	}
}
