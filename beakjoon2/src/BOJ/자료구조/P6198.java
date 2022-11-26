package BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P6198 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		Stack<Integer> stack = new Stack<>();
		long ans = 0;
		while (n-- > 0) {
			int h = Integer.valueOf(br.readLine());
			while (!stack.isEmpty() && stack.peek() <= h) {
				stack.pop();
			}
			ans += stack.size();
			stack.push(h);
		}
		System.out.println(ans);
	}// main
}// class