package BOJ.AlBasic2;

import java.io.*;
import java.util.*;

public class P10799_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		Stack<Character> stack = new Stack<>();

		int result = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == '(') {
				stack.push(ch);
			} else if (ch == ')') {
				stack.pop();
				if (str.charAt(i - 1) == '(') {
					result += stack.size();
				} else {
					result++;
				}
			}
		}
		System.out.println(result);
	}// end of main
}
// end of class