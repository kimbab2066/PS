package BOJ.AlBasic3;

import java.io.*;
import java.util.*;

public class P1918 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String expression = br.readLine();// 표기식
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < expression.length(); i++) {
			char oper = expression.charAt(i);
			if (65 <= oper && oper <= 90) {
				sb.append(oper);
			}
			switch (oper) {
			case '+':
			case '-':
			case '*':
			case '/':
				while (!stack.empty() && priority(stack.peek()) >= priority(oper)) {
					sb.append(stack.pop());
				}
				stack.push(oper);
				break;
			case '(':
				stack.push(oper);
				break;
			case ')':
				while (!stack.empty()) {
					if (stack.peek() == '(') {
						stack.pop();
						break;
					}
					sb.append(stack.pop());
				}
			}// end of switch
		} // end of for
		while (!stack.empty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);

	}// end of main

	static int priority(char oper) {
		if (oper == '(' || oper == ')') {
			return 0;
		} else if (oper == '+' || oper == '-') {
			return 1;
		} else if (oper == '*' || oper == '/') {
			return 2;
		} else {
			return -1;
		}
	}
}// end of class