package BOJ.별찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2442 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k < 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// end of main
}// end of class