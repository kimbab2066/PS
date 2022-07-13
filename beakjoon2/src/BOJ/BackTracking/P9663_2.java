package BOJ.BackTracking;

import java.io.*;
import java.util.*;

public class P9663_2 {
	static int N;
	static int arr[];
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		arr = new int[N];
		nQueen(0);
		System.out.println(cnt);
	}

	static void nQueen(int depth) {
		if (depth == N) {
			cnt++;
			return;
		}
		for (int i = 0; i < N; i++) {
			arr[depth] = i;
			if (poss(depth)) {
				nQueen(depth + 1);
			}
		}
	}// end of nQueen

	static boolean poss(int col) {
		for (int i = 0; i < col; i++) {
			if (arr[i] == arr[col])
				return false;
			else if (Math.abs(arr[col] - arr[i]) == Math.abs(col - i))
				return false;
		}
		return true;
	}// end of poss
}// end of class
