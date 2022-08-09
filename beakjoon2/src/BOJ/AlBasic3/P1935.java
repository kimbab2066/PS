package BOJ.AlBasic3;

import java.io.*;
import java.util.*;

public class P1935 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		String expression = br.readLine();// 표현식

		Double arr[] = new Double[27];

		// value in arr
		for (int i = 0; i < N; i++) {
			arr[i] = Double.valueOf(br.readLine());
		}
		Stack<Double> stack = new Stack<>();
		Double result = 0.0;
		for (int i = 0; i < expression.length(); i++) {
			char ch = expression.charAt(i);
			if ('A' <= ch && ch <= 'Z') {
				stack.push(arr[ch - 'A']);
			} else {
				Double num1 = stack.pop();
				Double num2 = stack.pop();
				switch (ch) {
				case '+':
					result = num2 + num1;
					break;
				case '-':
					result = num2 - num1;
					break;
				case '*':
					result = num2 * num1;
					break;
				case '/':
					result = num2 / num1;
					break;
				}// end of switch
				stack.push(result);
			}
		} // end of for
		System.out.printf("%.2f", stack.pop());

	}// end of main
}// end of class