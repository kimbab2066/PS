package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class test {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack stack = new Stack<>();
		while (N-- > 0) {
			String s = br.readLine();
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ' ') {
					while (!stack.empty()) {
						sb.append(stack.pop());
					}
					sb.append(" ");
				} else {
					stack.push(s.charAt(i));
				}
			}
			while (!stack.empty()) {
				sb.append(stack.pop());
			}
			sb.append("\n");
		} // end of while
		System.out.println(sb);
	}
}
