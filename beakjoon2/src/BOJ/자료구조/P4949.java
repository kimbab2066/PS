package BOJ.자료구조;

import java.util.Scanner;
import java.util.Stack;

public class P4949 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = "";
		StringBuilder sb = new StringBuilder();
		while (true) {
			str = in.nextLine();
			if (str.equals("."))
				break;
			Stack<Character> stack = new Stack<>();
			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (ch == '(' || ch == '[') {
					stack.push(ch);
					continue;
				} else if (!stack.isEmpty()) {
					if (stack.peek() == '(' && ch == ')') {
						stack.pop();
					} else if (stack.peek() == '[' && ch == ']') {
						stack.pop();
					} else if (stack.peek() == '(' && ch == ']') {
						break;
					} else if (stack.peek() == '[' && ch == ')') {
						break;
					}
				} else if (stack.isEmpty() && (ch == ')' || ch == ']')) {
					stack.push(ch);
					break;
				}
			}
			if (stack.isEmpty()) {
				sb.append("yes\n");
			} else {
				sb.append("no\n");
			}
		} // end of while
		System.out.println(sb);
	}// end of main
}// end of class