package beakjoon2.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2562 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int max = 0;
		int cnt = 0;
		for (int i = 0; i < 9; i++) {
			int val = Integer.parseInt(br.readLine());
			if (val > max) {
				max = val;
				cnt = i + 1;
			}
		}
		System.out.println(max);
		System.out.println(cnt);
	}// end of main
}// end of class
