package BOJ.AlBasic3;

import java.io.*;
import java.util.*;

public class P1935_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		Double arr[] = new Double[N];
		String expression = br.readLine();
		for (int i = 0; i < N; i++) {
			arr[i] = Double.valueOf(br.readLine());
		}
		Stack<Double> stack = new Stack<>();
		Double result = 0.0;
		for (int i = 0; i < expression.length(); i++) {
			char oper = expression.charAt(i);
			if (65 <= oper && oper <= 90) {// A<= oper <= Z
				stack.push(arr[oper - 65]);
			} else {
				Double num1 = stack.pop();
				Double num2 = stack.pop();
				switch (oper) {
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
				}
				stack.push(result);
			}
		}
		System.out.printf("%.2f", stack.pop());
	}// end of main
}// end of class