package baekjoon2.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P1037_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int min = 1000001, max = 1;
		while (N-- > 0) {
			int val = Integer.valueOf(st.nextToken());
			max = val > max ? val : max;
			min = val < min ? val : min;
		}
		System.out.println(min * max);
	}
}
