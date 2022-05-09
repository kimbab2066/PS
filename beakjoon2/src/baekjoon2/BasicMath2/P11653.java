package baekjoon2.BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		for (int i = 2; i <= Math.sqrt(N); i++) {
			while (N % i == 0) {
				System.out.println(i);
				N /= i;
			}
		}
		if (N != 1) {
			System.out.println(N);
		}

	}// end of main
}// end of class
//	소인수분해
//	2~N까지 나눠보자
