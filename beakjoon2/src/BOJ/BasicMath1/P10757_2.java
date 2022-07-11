package BOJ.BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10757_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		String str_A = st.nextToken();
		String str_B = st.nextToken();

		int max = Math.max(str_A.length(), str_B.length());

		int[] A = new int[max + 1];
		int[] B = new int[max + 1];

		for (int i = str_A.length() - 1, idx = 0; i >= 0; i--, idx++) {
			A[idx] = str_A.charAt(i) - '0';
		}

		for (int i = str_B.length() - 1, idx = 0; i >= 0; i--, idx++) {
			B[idx] = str_B.charAt(i) - '0';
		}

		for (int i = 0; i < max; i++) {
			int val = A[i] + B[i];
			A[i] = val % 10;
			A[i + 1] += val / 10;
		}

		StringBuilder sb = new StringBuilder();
		if (A[max] != 0) {
			sb.append(A[max]);
		}
		for (int i = max - 1; i >= 0; i--) {
			sb.append(A[i]);
		}
		System.out.println(sb);

	}// end of main
}// end of class

//	1.A와 B를 입력 받자.
//	2.A와 B 중 큰 숫자의 자릿수를 받자.
//	3.배열 생성.
//	4.