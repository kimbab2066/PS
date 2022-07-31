package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();

		while (N-- > 0) {
			sb.append(solution(br.readLine())).append("\n");
		} // end of while
		System.out.println(sb);
	}// end of main

	static String solution(String s) {
		Stack stack = new Stack<>();
		String str = s;
		for (char ch : str.toCharArray()) {
			if (ch == '(') {
				stack.push(ch);
			} else if (stack.empty()) {
				return "NO";
			} else {
				stack.pop();
			}
		}
		return stack.empty() == true ? "YES" : "NO";
	}
}// end of class
