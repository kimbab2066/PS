package baekjoon2.Geometry;

import java.io.*;
import java.util.*;

public class P3009 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int[] arr_1 = { Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()) };
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr_2 = { Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()) };
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr_3 = { Integer.valueOf(st.nextToken()), Integer.valueOf(st.nextToken()) };

		int x, y;

		//x
		if (arr_1[0] == arr_2[0]) x = arr_3[0];
		else if (arr_1[0] == arr_3[0]) x = arr_2[0];
		else x = arr_1[0];

		//y
		if (arr_1[1] == arr_2[1]) y = arr_3[1];
		else if (arr_1[1] == arr_3[1]) y = arr_2[1];
		else y = arr_1[1];

		System.out.println(x + " " + y);

	}// end of main
}// end of class