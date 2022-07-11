package BOJ.Sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int arr[] = new int[N];
		int cnt[] = new int[N];
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < N; i++) {
			cnt[i] = arr[i] = Integer.valueOf(st.nextToken());
		} // end of for

		Arrays.sort(cnt);
		// 정렬된 배열을 기준으로 map에 값을 넣으니
		// idx 0~n까지 순서대로 들어가며 우선순위가 정해진다.
		int rank = 0;
		for (int val : cnt) {
			if (!map.containsKey(val)) {
				map.put(val, rank);
				rank++;
			}
		}
		StringBuilder sb = new StringBuilder();

		for (int val : arr) {
			sb.append(map.get(val) + " ");
		}
		System.out.println(sb);
	}// end of main
}// end of class