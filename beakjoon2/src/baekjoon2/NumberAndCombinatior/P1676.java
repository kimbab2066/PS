package baekjoon2.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P1676 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int cnt = 0;

		// 10으로 나누어 떨어진다는 개념이 중요한 듯
		while (N >= 5) {
			cnt += N / 5;
			N /= 5;
		}
		System.out.println(cnt);
	}// end of main
}// end of class