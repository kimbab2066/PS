package BOJ.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10872 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(factorial(N));
	}// end of main

	static int factorial(int N) {
		if (N == 0) return 1;
		else {
			return N *= factorial(N - 1);
		}
	}// end of factorial
}// end of class

// 1~N *
// 1 * 2 * 3 * 4 * ....* N-1 * N
