package BOJ.별찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2446 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		// 2*N-1로 출력하다가 종료되면 반대쪽은 뒤집어서 출력하면 될 듯?
		// 윗부분 역 삼각형
		for (int i = N; i > 0; i--) {
			// 공백
			for (int k = 0; k < N - i; k++) {
				System.out.print(" ");
			}
			// 별
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// 아랫부분 삼각형
		for (int i = 2; i <= N; i++) {
			// 공백
			for (int k = 0; k < N - i; k++) {
				System.out.print(" ");
			}
			// 별
			for (int j = 0; j < 2 * i - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// end of main
}// end of class