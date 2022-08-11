package BOJ.AlBasic3;

import java.io.*;
import java.util.*;

public class P11656 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		String str[] = new String[S.length()];
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length; i++) {
			str[i] = S.substring(i);
		}
		Arrays.sort(str);

		for (String val : str) {
			sb.append(val).append("\n");
		}
		System.out.println(sb);
	}// end of main
}// end of class