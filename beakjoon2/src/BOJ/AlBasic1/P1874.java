package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		Stack<Integer> stack = new Stack<>();
		int start = 0;
		while (N-- > 0) {
			int val = Integer.valueOf(br.readLine());
			if (val > start) {

				for (int i = start + 1; i <= val; i++) {
					stack.push(i);
					sb.append("+\n");
				}
				start = val;
				// TOP의 원소가 입력된 val과 같지 않은 경우
			} else if (stack.peek() != val) {
				System.out.println("NO");
				return;
			}
			stack.pop();
			sb.append("-\n");
		}
		System.out.println(sb);
	}// end of main
}// end of class