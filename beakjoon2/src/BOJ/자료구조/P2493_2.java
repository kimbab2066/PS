package BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class P2493_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		Stack<int[]> stack = new Stack<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		// i를 1부터 시작하는 이유는 인덱스값을 스택에 같이 넣을 건데 0부터 시작해서 +1 해주기 귀찮기 때문
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			int val = Integer.valueOf(st.nextToken());
			while (!stack.isEmpty()) {
				// 조건 체크
				if (stack.peek()[1] >= val) {
					sb.append(stack.peek()[0] + " ");
					break;
				}
				// 조건을 채우지 못하면 빼자
				stack.pop();
			}
			// 비어 있으면 0
			if (stack.isEmpty()) {
				sb.append("0 ");
			}
			// array 형식으로 집어 넣으면 끝
			stack.push(new int[] { i, val });
		}
		System.out.println(sb);
	}// end of main
}// end of class