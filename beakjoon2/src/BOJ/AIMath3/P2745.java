package BOJ.AIMath3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2745 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		String B = str[0];
		int N = Integer.valueOf(str[1]);
		StringBuilder sb = new StringBuilder();
		int result = 0;
		int power = 0;

		for (int i = B.length() - 1; i >= 0; i--) {
			char ch = B.charAt(i);

			if (65 <= ch && ch <= 90) {
				result += (ch - 55) * Math.pow(N, power++);// 55 = A + 10
			} else {
				result += (ch - '0') * Math.pow(N, power++);
			}
		}
		System.out.println(result);
	}// end of main
}// end of class