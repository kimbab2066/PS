package BOJ.AIMath3;

import java.io.*;
import java.util.*;

public class P11576 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.valueOf(st.nextToken());
		int B = Integer.valueOf(st.nextToken());

		int M = Integer.valueOf(br.readLine());

		int decimal = 0;// 10진수

		st = new StringTokenizer(br.readLine());
		for (int i = M - 1; i >= 0; i--) {
			decimal += Integer.valueOf(st.nextToken()) * Math.pow(A, i);
			// Math.pow 대신 A*i를 할 경우 i가 0인 경우가 포함되어 값이 제대로 안나옴
		}

		Stack<Integer> stack = new Stack<>();
		while (decimal != 0) {
			stack.push(decimal % B);
			decimal /= B;
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			sb.append(stack.pop() + " ");
		}

		System.out.println(sb);
	}// end of main
}// end of class