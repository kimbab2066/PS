package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P9012_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		while (T-- > 0) {
			sb.append(Solution(br.readLine())).append("\n");
		}
		System.out.println(sb);
	}// end of main

	static String Solution(String str) {
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '(') {
				stack.push('(');
			} else if (stack.empty()) {// 닫는 괄호는 받았으나 비어있는 경우
				return "NO";
			} else {
				stack.pop();
			}
		}
		return stack.empty() == true ? "YES" : "NO";
	}// end of Solution
}// end of class