package BOJ.AlBasic3;

import java.io.*;
import java.util.*;

public class P10820_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		StringBuilder sb = new StringBuilder();
		while ((str = br.readLine()) != null) {
			int cnt[] = new int[4];
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (97 <= ch && ch <= 122) {
					cnt[0]++;
				} else if (65 <= ch && ch <= 90) {
					cnt[1]++;
				} else if (48 <= ch && ch <= 57) {
					cnt[2]++;
				} else if (32 == ch) {
					cnt[3]++;
				}
			}
			sb.append(cnt[0] + " " + cnt[1] + " " + cnt[2] + " " + cnt[3] + "\n");
		}
		System.out.println(sb);
	}// end of main
}// end of class