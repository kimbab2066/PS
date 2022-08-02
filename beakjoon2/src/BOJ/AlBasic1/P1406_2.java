package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P1406_2 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		Stack<Character> lStack = new Stack<>();
		Stack<Character> rStack = new Stack<>();

		String str = br.readLine();
		// char in stack
		for (int i = 0; i < str.length(); i++) {
			lStack.push(str.charAt(i));
		}

		int N = Integer.valueOf(br.readLine());

		while (N-- > 0) {

			String s = br.readLine();

			switch (s.charAt(0)) {
			case 'L':
				if (lStack.empty()) break;// 맨 앞인 경우 무시
				rStack.push(lStack.pop());
				break;
			case 'D':
				if (rStack.empty()) break;// 맨 뒤인 경우 무시
				lStack.push(rStack.pop());
				break;
			case 'B':
				if (lStack.empty()) break;// 맨 앞인 경우 무시
				lStack.pop();
				break;
			case 'P':
				lStack.push(s.charAt(2));
				break;
			}
		} // end of while

		while (!lStack.empty()) {
			rStack.push(lStack.pop());
		}
		while (!rStack.empty()) {
			sb.append(rStack.pop());
		}
		System.out.println(sb);
	}// end of main
}
// end of class