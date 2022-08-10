package BOJ.AlBasic3;

import java.io.*;
import java.util.*;

public class P1918_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String expression = br.readLine();

		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (65 <= ch && ch <= 90) { // A to Z
				sb.append(ch);
			} else if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				while (!stack.empty()) {
					if (stack.peek() == '(') {
						stack.pop();
						break;
					}
					sb.append(stack.pop());
				}
			} else {
				while (!stack.empty() && priority(stack.peek()) >= priority(ch)) {
					sb.append(stack.pop());
				}
				stack.push(ch);
			}
		} // end of for
		while (!stack.empty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
	}// end of main

	// 우선순위는 스택을 그려보면 이해하기 쉬움
	static int priority(char oper) {
		if (oper == '(') {
			return 0;
		} else if (oper == '+' || oper == '-') {
			return 1;
		} else
			return 2;
	}
}// end of class