package BOJ.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P1037 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(arr);

		if (N >= 2) {
			System.out.println(arr[0] * arr[N - 1]);
		} else {
			System.out.println(arr[0] * arr[0]);
		}

	}// end of main
}// end of class
