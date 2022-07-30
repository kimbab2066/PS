package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P9093 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		Stack stack = new Stack<>();

		while (T-- > 0) {
			String str = br.readLine() + "\n";
			for (char ch : str.toCharArray()) {// 1글자씩 쪼개어 집어 넣는 것
				// 그러니 스택을 사용 시 str = am 일 때
				// a 들어가고 그 후 m이 들어간 후 공백이 들어오는 경우 m을 sb에 append 하고 a를 append
				if (ch == ' ' || ch == '\n') {
					while (!stack.isEmpty()) {
						sb.append(stack.pop());
					}
					sb.append(ch);
				} else {
					stack.push(ch);
				}
			}
		} // end of Loop
		System.out.println(sb);
	}// end of main
}// end of class