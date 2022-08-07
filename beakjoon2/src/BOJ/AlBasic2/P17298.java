package BOJ.AlBasic2;

import java.io.*;
import java.util.*;

public class P17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		Stack<Integer> stack = new Stack<>();
		int arr[] = new int[N];
		// value in arr
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				arr[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			arr[stack.pop()] = -1;
		}
		for (int i = 0; i < N; i++) {
			sb.append(arr[i] + " ");
		}
		System.out.println(sb);
	}// end of main
}// end of class