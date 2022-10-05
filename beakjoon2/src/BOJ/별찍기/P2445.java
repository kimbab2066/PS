package BOJ.별찍기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2445 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		// 양 모서리 부분부터 i로 시작하면 될 듯?
		// 공백은 N-i * 2하면 될 듯?
		for (int i = 1; i <= N; i++) {
			// 왼쪽 모서리
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			// 공백
			for (int k = 0; k < (N - i) * 2; k++) {
				System.out.print(" ");
			}
			// 오른쪽 모서리
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i = N - 1; i > 0; i--) {
			// 왼쪽 모서리
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			// 공백
			for (int k = 0; k < (N - i) * 2; k++) {
				System.out.print(" ");
			}
			// 오른쪽 모서리
			for (int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}// end of main
}// end of class