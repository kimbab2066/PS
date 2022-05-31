package baekjoon2.Undefined;

import java.io.*;
import java.util.*;

public class P2576 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		int min = 9999;
		for (int i = 0; i < 7; i++) {
			int val = Integer.valueOf(br.readLine());
			if (val % 2 != 0) {
				sum += val;
				min = Math.min(min, val);
			}
		}

		if (sum == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}
}
