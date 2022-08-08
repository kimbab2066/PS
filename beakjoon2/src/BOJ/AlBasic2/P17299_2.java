package BOJ.AlBasic2;

import java.io.*;
import java.util.*;

public class P17299_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * value in arr
		 * 
		 * count arr
		 * 
		 * result arr
		 */
		int N = Integer.valueOf(br.readLine());
		int arr[] = new int[N];
		int cnt[] = new int[1000001];
		int result[] = new int[N];

		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		// value in arr
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		// cnt in arr
		for (int i = 0; i < N; i++) {
			cnt[arr[i]]++;
		}

		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			// 스택 최상단 숫자와 i를 비교한다고 생각하면 편함
			while (!stack.empty() && cnt[arr[stack.peek()]] < cnt[arr[i]]) {
				result[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		while (!stack.empty()) {
			result[stack.pop()] = -1;
		}

		for (int i = 0; i < N; i++) {
			sb.append(result[i] + " ");
		}
		System.out.println(sb);
	}// end of main
}// end of class