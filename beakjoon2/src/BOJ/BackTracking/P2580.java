package BOJ.BackTracking;

import java.io.*;
import java.util.*;

public class P2580 {
	static int arr[][] = new int[9][9];
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		for (int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 9; j++) {
				arr[i][j] = Integer.valueOf(st.nextToken());
			}
		}
		sudoku(0, 0);
	}// end of main

	public static void sudoku(int x, int y) {
		// full col
		if (y == 9) {
			sudoku(x + 1, 0);
			return;
		}
		// ful row and complete output
		if (x == 9) {
			for (int i = 0; i < 9; i++) {
				for (int j = 0; j < 9; j++) {
					sb.append(arr[i][j]).append(" ");
				}
				sb.append("\n");
			}
			System.out.println(sb);
			System.exit(0);
		}
		// search
		if (arr[x][y] == 0) {
			for (int i = 1; i <= 9; i++) {
				if (poss(x, y, i)) {
					arr[x][y] = i;
					sudoku(x, y + 1);
				}
			}
			arr[x][y] = 0;
			return;
		}
		sudoku(x, y + 1);
	}// end of sudoku

	public static boolean poss(int x, int y, int val) {

		// row check
		for (int i = 0; i < 9; i++) {
			if (arr[x][i] == val) {
				return false;
			}
		}
		// col check
		for (int i = 0; i < 9; i++) {
			if (arr[i][y] == val) {
				return false;
			}
		}
		// square check

		int s_row = x / 3 * 3;
		int s_col = y / 3 * 3;

		for (int i = s_row; i < s_row + 3; i++) {
			for (int j = s_col; j < s_col + 3; j++) {
				if (arr[i][j] == val) {
					return false;
				}
			}
		}
		return true;
	}// end of poss
}// end of class
