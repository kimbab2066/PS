package BOJ.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P11399_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[1001];
		while (N-- > 0) {
			int idx = Integer.valueOf(st.nextToken());
			arr[idx]++;
		}
		int total = 0, sum = 0;
		for (int i = 1; i < 1001; i++) {
			while (arr[i]-- > 0) {
				total += (i + sum);
				sum += i;
				System.out.println(sum);
			}
		}
		System.out.println(total);
	}// end of main
}// end of class