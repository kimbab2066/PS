package baekjoon2.BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		if (N == 4 || N == 7) {
			System.out.println(-1);
		} else if (N % 5 == 0) {
			System.out.println(N / 5);
		} else if (N % 5 == 1 || N % 5 == 3) {
			System.out.println(N / 5 + 1);
		} else if (N % 5 == 2 || N % 5 == 4) {
			System.out.println(N / 5 + 2);
		}

	}// end of main
}// end of class

//	N이 주어지고, 5킬로 or 3킬로 봉지로 최소 개수 출력
//	N킬로를 만들 수 없다면 -1