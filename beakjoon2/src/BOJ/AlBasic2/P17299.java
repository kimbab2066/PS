package BOJ.AlBasic2;

import java.io.*;
import java.util.*;

public class P17299 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int arr[] = new int[N];
		int result[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		// value in arr
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		int cnt[] = new int[1000001];
		for (int i = 0; i < N; i++) {
			cnt[arr[i]]++;
		}
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < N; i++) {
			while (!stack.empty() && cnt[arr[stack.peek()]] < cnt[arr[i]]) {
				result[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		while (!stack.empty()) {
			result[stack.pop()] = -1;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			sb.append(result[i] + " ");
		}
		System.out.println(sb);
	}// end of main
}// end of class