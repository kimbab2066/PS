package BOJ.BackTracking;

import java.io.*;
import java.util.*;

public class P9663 {
	static int N;
	static int arr[];
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = new int[N];
		queen(0);
		System.out.println(cnt);
	}// end of main

	static void queen(int depth) {
		//full col
		if (depth == N) {
			cnt++;
			return;
		}
		
		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			//recursion and col check
			if (check(depth)) {
				queen(depth + 1);
			}
		}
	}// end of queen

	static boolean check(int col) {
		for (int i = 0; i < col; i++) {
			//now = col -> return false
			if (arr[i] == arr[col]) return false;
			//| | = | | -> return false
			else if (Math.abs(col - i) == Math.abs(arr[col] - arr[i])) return false;
		}
		return true;
	}
}// end of class
