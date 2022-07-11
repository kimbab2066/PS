package BOJ.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		System.out.println(fibo(N));
	}
	static int fibo(int N) {
		if (N < 2) return N;
		else return fibo(N - 1) + fibo(N - 2);
	}
}
