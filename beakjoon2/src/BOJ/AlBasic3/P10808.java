package BOJ.AlBasic3;

import java.io.*;
import java.util.*;

public class P10808 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int cnt[] = new int[26];
		for (int i = 0; i < S.length(); i++) {
			cnt[S.charAt(i) - 97]++;
		}
		StringBuilder sb = new StringBuilder();
		for (int val : cnt) {
			sb.append(val + " ");
		}
		System.out.println(sb);

	}// end of main
}// end of class