package BOJ.Undefined;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int arr[] = new int[9];
		for (int i = 0; i <= N; i++) {
			arr[i] = i;
		}
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < N; i++) {
			stack.push(Integer.valueOf(br.readLine()));

		}

	}// end of main
}// end of class