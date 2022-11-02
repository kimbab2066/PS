package BOJ.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// +,-를 전부 따지자
		int sum = Integer.MAX_VALUE;
		String[] subtract = br.readLine().split("-");
		for (int i = 0; i < subtract.length; i++) {
			int tmp = 0;
			String[] add = subtract[i].split("\\+");
			for (int j = 0; j < add.length; j++) {
				tmp += Integer.valueOf(add[j]);
			}
			if (sum == Integer.MAX_VALUE) {
				sum = tmp;
			} else {
				sum -= tmp;
			}
		}
		System.out.println(sum);
	}// end of main
}// end of class