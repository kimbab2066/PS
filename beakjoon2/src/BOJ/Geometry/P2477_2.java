package BOJ.Geometry;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2477_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int K = Integer.valueOf(br.readLine());
		int[] arr = new int[6];
		int MaxWidthI = 0, MaxWidth = 0, MaxHeight = 0, MaxHeightI = 0, d;
		for (int i = 0; i < 6; i++) {
			st = new StringTokenizer(br.readLine());
			d = Integer.valueOf(st.nextToken());
			arr[i] = Integer.valueOf(st.nextToken());
			if ((d == 1 || d == 2) && MaxWidth < arr[i]) {
				MaxWidth = arr[i];
				MaxWidthI = i;// 위치
			} else if ((d == 3 || d == 4) && MaxHeight < arr[i]) {
				MaxHeight = arr[i];
				MaxHeightI = i;// 위치
			}
		} // end of for
		int r, l, minW, minH;
		if (MaxWidthI + 1 == 6) r = 0;
		else r = MaxWidthI + 1;

		if (MaxWidthI - 1 == -1) l = 5;
		else l = MaxWidthI - 1;
		// Empty Rectangular Height
		minH = Math.abs(arr[r] - arr[l]);

		if (MaxHeightI + 1 == 6) r = 0;
		else r = MaxHeightI + 1;

		if (MaxHeightI - 1 == -1) l = 5;
		else l = MaxHeightI - 1;
		// Empty Rectangular Width
		minW = Math.abs(arr[r] - arr[l]);

		System.out.println(((MaxWidth * MaxHeight) - (minH * minW)) * K);

	}// end of main
}// end of class
