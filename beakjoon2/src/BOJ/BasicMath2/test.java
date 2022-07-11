package BOJ.BasicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		int cnt = 0;

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		while (st.hasMoreTokens()) {

			boolean prime = true;

			int number = Integer.parseInt(st.nextToken());

			if (number == 1) continue;

			for (int i = 2; i <= Math.sqrt(number); i++) {

				if (number % i == 0) {
					prime = false;
					break;
				}
			}
			if (prime) cnt++;
		}
		System.out.println(cnt);
	}// end of main
}// end of class