package BOJ.BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while (T-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int H = Integer.parseInt(st.nextToken());
			int W = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());

			if (N % H == 0) sb.append(H * 100 + N / H).append("\n");
			else sb.append(N % H * 100 + (N / H + 1)).append("\n");
		} // end of while
		System.out.println(sb);
	}// end of main
}// end of class

// T = test_case
// H = 층 수, W = 방 수, N = 몇 번째 손님
// H*100 + W 이런 식으로
// 하다가 H의 최대가 된다면 H 초기화 + W 초기화
// H = 6, W = 12, N = 10 일 때
// 101시작, N=1
// 201 301 401 501 601, N = 6 
// 102, N = 7
// 202 302 402, N = 10