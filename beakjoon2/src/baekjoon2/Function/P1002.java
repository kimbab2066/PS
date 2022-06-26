package baekjoon2.Function;

import java.io.*;
import java.util.*;

public class P1002 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.valueOf(br.readLine());
		StringTokenizer st;

		while (K-- > 0) {
			st = new StringTokenizer(br.readLine(), " ");
			int x1 = Integer.valueOf(st.nextToken());
			int y1 = Integer.valueOf(st.nextToken());
			int r1 = Integer.valueOf(st.nextToken());
			int x2 = Integer.valueOf(st.nextToken());
			int y2 = Integer.valueOf(st.nextToken());
			int r2 = Integer.valueOf(st.nextToken());

			System.out.println(point(x1, y1, r1, x2, y2, r2));
		}

	}// end of main

	public static int point(int x1, int y1, int r1, int x2, int y2, int r2) {

		// 중점 = C-A의 제곱 + C-B의 제곱
		int distance = (int) (Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		// x,y 좌표 일치 시
		if (x1 == x2 && y1 == y2 && r1 == r2) {
			return -1;
		}
		// 두 점 사이의 거리 > 두 반지름의 합
		else if (distance > Math.pow(r1 + r2, 2)) {
			return 0;
		}
		// 원 안 내접 x
		else if (distance < Math.pow(r2 - r1, 2)) {
			return 0;
		}
		// 내접
		else if (distance == Math.pow(r2 - r1, 2)) {
			return 1;
		}
		// 외접
		else if (distance == Math.pow(r1 + r2, 2)) {
			return 1;
		} else {
			return 2;
		}
	}
}// end of class