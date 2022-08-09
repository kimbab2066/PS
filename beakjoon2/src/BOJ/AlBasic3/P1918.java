package BOJ.AlBasic3;

import java.io.*;
import java.util.*;

public class P1918 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String expression = br.readLine();// 표기식
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if (65 <= ch && ch <= 90) {// 문자인 경우 (A to Z)
				sb.append(ch);
			} else {

				switch (ch) {
				case '+':
				case '-':
				case '*':
				case '/':
					while (!stack.empty() && priority(stack.peek()) >= priority(ch)) {
						sb.append(stack.pop());
					}
					stack.push(ch);
					break;
				case '(':
					stack.push(ch);
				case ')':
					while (!stack.empty()) {
						if (stack.peek() == ch) {
							stack.pop();
							break;
						}
					}
				}
			}
		} // end of for
		while (!stack.empty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
	}

	public static int priority(char ch) {
		if (ch == '(') {
			return 0;
		} else if (ch == '+' || ch == '-') {
			return 1;
		} else
			return 2;
	}
}// end of class