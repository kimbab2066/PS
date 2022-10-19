package BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P4949_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = "";
		while ((str = br.readLine()).compareTo(".") != 0) {
			sb.append(balance(str));
		}
		System.out.println(sb);
		br.close();
	}// end of main

	static String balance(String str) {
		char[] stack = str.toCharArray();
		int top = 0;
		for (int i = 0; i < str.length(); i++) {
			if (stack[i] == '(' || stack[i] == '[') {
				stack[top++] = stack[i];
			} else if (stack[i] == ')') {
				if (top == 0 || stack[top - 1] != '(') return "no\n";
				top--;
			} else if (stack[i] == ']') {
				if (top == 0 || stack[top - 1] != '[') return "no\n";
				top--;
			}
		}
		if(top==0) return "yes\n";
		else return "no\n";
	}
}// end of class