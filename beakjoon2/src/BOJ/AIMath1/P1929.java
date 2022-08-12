package BOJ.AIMath1;

import java.io.*;
import java.util.*;

public class P1929 {
	public static boolean check[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int M = Integer.valueOf(str[0]);
		int N = Integer.valueOf(str[1]);
		check = new boolean[N + 1];
		makePrime();
		StringBuilder sb = new StringBuilder();
		for (int i = M; i <= N; i++) {
			if (!check[i])
				sb.append(i + "\n");
		}
		System.out.println(sb);
	}// end of main

	static void makePrime() {
		check[0] = check[1] = true;
		for (int i = 2; i < Math.sqrt(check.length); i++) {
			if (check[i])
				continue;
			for (int j = i * i; j < check.length; j += i) {
				check[j] = true;
			}
		}
	}
}// end of class