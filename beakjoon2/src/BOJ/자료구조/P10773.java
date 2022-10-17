package BOJ.자료구조;

import java.util.Scanner;
import java.util.Stack;

public class P10773 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int k = in.nextInt();
		Stack<Integer> stack = new Stack<>();
		while (k-- > 0) {
			int val = in.nextInt();
			if (val == 0) {
				stack.pop();
				continue;
			}
			stack.push(val);
		}
		int result = 0;
		while (!stack.isEmpty()) {
			result += stack.pop();
		}
		System.out.println(result);
	}// end of main
}// end of class