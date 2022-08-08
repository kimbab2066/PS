package BOJ.AlBasic2;

import java.io.*;
import java.util.*;

public class P17298_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int arr[] = new int[N];
		String str[] = br.readLine().split(" ");
		// value in arr
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(str[i]);
		}

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			// stack is not empty && stack.peek() = 0 to N-1 < arr[i]
			while (!stack.empty() && arr[stack.peek()] < arr[i]) {
				arr[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		// 남아있는 stack = -1
		while (!stack.empty()) {
			arr[stack.pop()] = -1;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(arr[i] + " ");
		}
		System.out.println(sb);
	}// end of main
}// end of class
//peek 관련 참고 링크 https://www.educative.io/answers/what-is-stackpeek-in-java