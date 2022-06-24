package baekjoon2.Geometry;

import java.io.*;
import java.util.*;

public class P4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		while (true) {

			st = new StringTokenizer(br.readLine(), " ");
			int x = Integer.valueOf(st.nextToken());
			int y = Integer.valueOf(st.nextToken());
			int z = Integer.valueOf(st.nextToken());
			
			if (x > y || x > z) {
				int tmp = x;
				x = z;
				z = tmp;
			} else if (y > x && y > z) {
				int tmp = y;
				y = z;
				z = tmp;
			}

			// escape
			if (x == 0 && y == 0 && z == 0) break;
			
			if (Math.pow(x, 2) + Math.pow(y, 2) == Math.pow(z, 2)) {
				sb.append("right" + "\n");
			} else {
				sb.append("wrong" + "\n");
			}

		}
		System.out.println(sb);
	}// end of main
}// end of class