package baekjoon2.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P5086 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while (true) {
			String str = br.readLine();
			if (str.equals("0 0"))
				break;
			st = new StringTokenizer(str, " ");
			int a = Integer.valueOf(st.nextToken());
			int b = Integer.valueOf(st.nextToken());
			if (b % a == 0) {
				sb.append("factor\n");
			} else if (a % b == 0) {
				sb.append("multiple\n");
			} else {
				sb.append("neither\n");
			}
		} // end of while
		System.out.println(sb);
	}// end of main
}// end of class
