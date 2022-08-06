package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P17413_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		// < , > , < > 안, 밖, 공백
		String str = br.readLine();
		boolean check = false;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '<') {
				while (!stack.empty()) {
					sb.append(stack.pop());
				}
				check = true;
			} else if (ch == '>') {
				check = false;
				sb.append(ch);
				continue;
			}
			if (check) {
				sb.append(ch);
			} else if (!check) {
				if (ch == ' ') {
					while (!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(' ');
					continue;
				} else {
					stack.push(ch);
				}
			}
		} // end of for
		while (!stack.isEmpty()) {
			sb.append(stack.pop());
		}
		System.out.println(sb);
	}// end of main
}// end of class