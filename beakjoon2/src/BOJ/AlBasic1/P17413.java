package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P17413 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();
		Stack<Character> stack = new Stack<>();
		boolean check = false;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '<') {
				while (!stack.isEmpty()) {
					sb.append(stack.pop());
				}
				check = true;
			} else if (str.charAt(i) == '>') {
				check = false;
				sb.append(str.charAt(i));
				continue;
			}
			if (check) {
				sb.append(str.charAt(i));
			} else if (!check) {
				if (str.charAt(i) == ' ') {
					while (!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(' ');
					continue;
				} else {
					stack.push(str.charAt(i));
				}
			}

		}
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}

		System.out.println(sb);
	}// end of main
}// end of class