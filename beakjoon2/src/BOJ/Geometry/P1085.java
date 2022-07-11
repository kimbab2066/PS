package BOJ.Geometry;

import java.io.*;
import java.util.*;

public class P1085 {
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		/*
		 * x,y,w,h 왼쪽 아래 (0,0), 오른쪽 위(w,h) 경계선까지 가는 최소값 : x + y compare (w - x) +(h - y)
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		st = new StringTokenizer(br.readLine(), " ");

		int X = Integer.valueOf(st.nextToken());
		int Y = Integer.valueOf(st.nextToken());
		int W = Integer.valueOf(st.nextToken());
		int H = Integer.valueOf(st.nextToken());

		int A = X > W - X ? W - X : X;
		int B = Y > H - Y ? H - Y : Y;
		System.out.println(A > B ? B : A);

	}// end of main
}// end of class