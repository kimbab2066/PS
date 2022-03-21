package beakjoon2.If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2480 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());

		// 같은 눈 3개
		if (a == b && b == c && c == a) {
			System.out.println(10000 + (a * 1000));
		}
		// 같은 눈 2개
		else if (a == b || a == c) {
			System.out.println(1000 + (a * 100));
		} else if (b == a || b == c) {
			System.out.println(1000 + (b * 100));
		} else if (c == a || c == b) {
			System.out.println(1000 + (c * 100));
		} else {// 모두 다른 눈
			System.out.println(Math.max(a, Math.max(b, c)) * 100);
		}
	}// end of main
}// end of class
