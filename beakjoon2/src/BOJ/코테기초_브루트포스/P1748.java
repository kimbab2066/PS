package BOJ.코테기초_브루트포스;

import java.io.*;
import java.util.*;

public class P1748 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.valueOf(br.readLine());
		long result = 0;
		int digit = 0;// 자리수
		int plus = 1;
		int num = 10;

		// for (long i = 1; i <= N; i *= 10) {
//			result += (N - i) + 1;
//		}
		for (int i = 1; i <= N; i++) {
			if (i % num == 0) {
				plus++;
				num *= 10;
			}
			digit += plus;
		}
		System.out.println(digit);
		//System.out.println(result);
	}// end of main
}// end of class
