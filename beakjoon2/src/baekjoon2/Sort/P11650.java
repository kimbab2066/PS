package baekjoon2.Sort;

import java.io.*;
import java.util.*;

public class P11650 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st;
		int arr[][] = new int[N][2];
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			arr[i][0] = x;
			arr[i][1] = y;
		} // end of for

		// 값 넣었음
		for (int i = 0; i < N; i++) {
			for (int j = i; j < N; j++) {
				if (arr[i][0] > arr[j][0]) {
					int tmp_x = arr[i][0];
					int tmp_y = arr[i][1];

					arr[i][0] = arr[j][0];
					arr[i][1] = arr[j][1];

					arr[j][0] = tmp_x;
					arr[j][1] = tmp_y;
				} else if (arr[i][0] == arr[j][0] && arr[i][1] > arr[j][1]) {
					int tmp = arr[i][1];
					arr[i][1] = arr[j][1];
					arr[j][1] = tmp;
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int[] val : arr) {
			sb.append(val[0]).append(" " + val[1]).append("\n");
		}
		System.out.println(sb);
	}// end of main
}// end of classs