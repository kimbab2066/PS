package BOJ.AIMath2;

import java.io.*;
import java.util.*;

public class P17087 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.valueOf(st.nextToken());
		int S = Integer.valueOf(st.nextToken());

		st = new StringTokenizer(br.readLine());
		int arr[] = new int[N];
		// value in arr
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}

		for (int i = 0; i < N; i++) {
			arr[i] -= S;
			if (arr[i] < 0) {
				arr[i] = -arr[i];
			}
		}
		int gcd = arr[0];
		for (int i = 1; i < arr.length; i++) {
			gcd = gcd(gcd, arr[i]);
		}

		System.out.println(gcd);
	}// end of main

	static int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}// end of class