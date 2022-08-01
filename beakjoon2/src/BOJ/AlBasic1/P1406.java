package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringBuilder sb = new StringBuilder();

		Stack<Character> lStack = new Stack<>();
		Stack<Character> rStack = new Stack<>();
		for (int i = 0; i < str.length(); i++) {
			lStack.push(str.charAt(i));
		}

		int N = Integer.valueOf(br.readLine());
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			char oper = s.charAt(0);
			if (oper == 'L') {
				if(lStack.empty()) continue;
				rStack.push(lStack.pop());
			} else if (oper == 'D') {
				if(rStack.empty()) continue;
				lStack.push(rStack.pop());
			} else if (oper == 'B') {
				if(lStack.empty()) continue;
				lStack.pop();
			} else if (oper == 'P') {
				lStack.push(s.charAt(2));
			}
		}
		while (!lStack.empty()) {
			rStack.push(lStack.pop());
		}
		while (!rStack.empty()) {
			sb.append(rStack.pop());
		}
		System.out.println(sb);
	}// end of main
}// end of class