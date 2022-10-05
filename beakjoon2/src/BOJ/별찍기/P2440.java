package BOJ.별찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2440 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		for (int i = 0; i < N; i++) {
			for (int j = N; j > i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// end of main
}// end of class