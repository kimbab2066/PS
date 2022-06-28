package baekjoon2.Geometry;

import java.io.*;
import java.util.*;

public class P1004_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		int T = Integer.valueOf(br.readLine());

		while (T-- > 0) {
			st = new StringTokenizer(br.readLine());
			// start point
			int x1 = Integer.valueOf(st.nextToken());
			int y1 = Integer.valueOf(st.nextToken());

			// end point
			int x2 = Integer.valueOf(st.nextToken());
			int y2 = Integer.valueOf(st.nextToken());

			// number of planets
			st = new StringTokenizer(br.readLine());
			int N = Integer.valueOf(st.nextToken());

			int cnt = 0;

			while (N-- > 0) {
				st = new StringTokenizer(br.readLine());
				int cx = Integer.valueOf(st.nextToken());
				int cy = Integer.valueOf(st.nextToken());
				int r = Integer.valueOf(st.nextToken());

				if (Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) < Math.pow(r, 2)
						&& Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) < Math.pow(r, 2)) {
					continue;
				} else if (Math.pow(x1 - cx, 2) + Math.pow(y1 - cy, 2) < Math.pow(r, 2)
						|| Math.pow(x2 - cx, 2) + Math.pow(y2 - cy, 2) < Math.pow(r, 2)) {
					cnt++;
				}
			} // end of while
			sb.append(cnt + "\n");
		} // end of while
		System.out.println(sb);
	}// end of main
}// end of class