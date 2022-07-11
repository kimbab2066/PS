package BOJ.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P2981_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int[] arr = new int[N];
		int arr_length = arr.length;
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < arr_length; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		} // end of for
		Arrays.sort(arr);

		int GCDval = arr[1] - arr[0];

		for (int i = 2; i < N; i++) {
			GCDval = GCD(GCDval, arr[i] - arr[i - 1]);
		}
		for (int i = 2; i <= GCDval; i++) {
			if (GCDval % i == 0) {
				sb.append(i).append(" ");
			}
		}
		System.out.println(sb);
	}// end of main

	static int GCD(int a, int b) {
		if (b == 0 ) return a;
		return GCD(b, a % b);
	}
}// end of class