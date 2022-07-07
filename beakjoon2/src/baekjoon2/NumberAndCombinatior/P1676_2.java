package baekjoon2.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P1676_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		// 0 count
		int cnt = 0;
		
		while (N >= 5) {
			cnt += N / 5;
			N /= 5;
		}
		System.out.println(cnt);
	}// end of main
}// end of class