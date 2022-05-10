package baekjoon2.BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//메서드 없이 사용가능한 방법도 있다는 걸 확인
public class P1929_2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		StringBuilder sb = new StringBuilder();

		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());

		boolean[] prime = new boolean[N + 1];

		for (int i = 2; i <= N; i++) {
			if (prime[i]) continue;

			if (i >= M) sb.append(i).append("\n");
			for (int j = i + i; j <= N; j += i) {
				prime[j] = true;
			}
		}
		System.out.println(sb);
	}// end of main
}// end of class
