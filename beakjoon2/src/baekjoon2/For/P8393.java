package baekjoon2.For;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P8393 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		for (int i = 1; i <= N; i++) {
			sum += i;
		} // end of for
		System.out.println(sum);
	}// end of main
}// end of class
