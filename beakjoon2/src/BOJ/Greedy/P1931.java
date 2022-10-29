package BOJ.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class P1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());

		StringTokenizer st;
		int[][] time = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.valueOf(st.nextToken());
			int end = Integer.valueOf(st.nextToken());
			time[i][0] = start;
			time[i][1] = end;
		} // end of for

		Arrays.sort(time, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				// 종료 시간이 같으면 둘 중 시작 시간이 빠른거로 정렬 기준을 설정
				if (o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				return o1[1] - o2[1];
			}
		});
		int cnt = 0;
		int prev_time = 0;
		for (int i = 0; i < N; i++) {
			if (prev_time <= time[i][0]) {
				prev_time = time[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
	}// end of main
}// end of class