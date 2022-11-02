package BOJ.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P13305_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		long[] distance = new long[N - 1];
		long[] price = new long[N - 1];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N - 1; i++) {
			distance[i] = Long.valueOf(st.nextToken());
		}
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N - 1; i++) {
			price[i] = Long.valueOf(st.nextToken());
		}
		long sum = distance[0] * price[0];
		long min = price[0];
		int minIdx = 0;

		for (int i = 1; i < N - 1; i++) {
			if (min >= price[i]) {
				min = price[i];
				minIdx = i;
			}
			sum += price[minIdx] * distance[i];
		}
		System.out.println(sum);
	}// end of main
}// end of class