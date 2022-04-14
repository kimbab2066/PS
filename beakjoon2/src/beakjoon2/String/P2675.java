package beakjoon2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2675 {
	public static void main(String[] args) throws IOException {
		// 문자열 S를 입력받는다
		// 각 문자를 R번 반복해 새 문자열 P를 만든다
		// 테스트 케이스가 주어진다
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			String[] str = br.readLine().split(" ");

			int R = Integer.parseInt(str[0]);

			for (byte val : str[1].getBytes()) {
				for (int j = 0; j < R; j++) {
					sb.append((char) val);
				}
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}// end of main
}// end of class
