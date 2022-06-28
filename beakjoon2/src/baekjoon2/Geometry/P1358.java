package baekjoon2.Geometry;

import java.io.*;
import java.util.*;

public class P1358 {
	public static double getDistance(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		// start point
		int W = Integer.valueOf(st.nextToken());
		int H = Integer.valueOf(st.nextToken()); 
		int X = Integer.valueOf(st.nextToken());
		int Y = Integer.valueOf(st.nextToken());
		int P = Integer.valueOf(st.nextToken());

		// end point
		int XWidth = X + W;
		int YHeight = Y + H;
		// radius
		int R = H / 2, YR = Y + R;
		int cnt = 0;
		while (P-- > 0) { 
			st = new StringTokenizer(br.readLine());
			int px = Integer.valueOf(st.nextToken());
			int py = Integer.valueOf(st.nextToken());
			if (X <= px && px <= XWidth && Y <= py && py <= YHeight 
					|| getDistance(px, py, X, YR) <= R
					|| getDistance(px, py, XWidth, YR) <= R) {
				cnt++;
			}
		} // end of while
		System.out.println(cnt);
		
	}// end of main
}// end of class