package BOJ.AlBasic3;

import java.io.*;
import java.util.*;

public class P11655 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if (65 <= ch && ch <= 90) {
				ch += 13;
				if (ch > 90) {
					ch -= 26;
				}
			} else if (97 <= ch && ch <= 122) {
				ch += 13;
				if (ch > 122) {
					ch -= 26;
				}
			}
			sb.append(ch);
		} // end of for
		System.out.println(sb);
	}// end of main
}// end of class