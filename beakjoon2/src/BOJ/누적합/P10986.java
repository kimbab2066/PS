package BOJ.누적합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10986 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 1 3 6 7 9
		// 1 0 0 1 0
		// M = 3, i,j의 쌍
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[N + 1];
		long[] cnt = new long[M];
		for (int i = 1; i <= N; i++) {
			arr[i] = arr[i - 1] + Integer.valueOf(st.nextToken());
			arr[i] %= M;
			cnt[arr[i]]++;
		}
		long ans = cnt[0];// 그냥 자체로 나눠떨어지는 누적합의 갯수를 의미함
		for (int i = 0; i < M; i++) {// 나머지가 0인 경우 nCr
			// 같은 나머지 개수로 조합을 구하여 추가
			ans += cnt[i] * (cnt[i] - 1) / 2;
		}
		System.out.println(ans);
	}// end of main
}// end of class