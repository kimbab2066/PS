package BOJ.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11399_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] p = new int[N];
		for (int i = 0; i < N; i++) {
			p[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(p);
		int cnt = 0;
		for (int i = N; i > 0; i--) {
			cnt += p[N - i] * i;
		}
		System.out.println(cnt);
	}// end of main
}// end of class