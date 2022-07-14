package BOJ.BackTracking;

import java.io.*;
import java.util.*;

public class P14888_3 {

	static int N;
	static int number[];
	static int operator[] = new int[4];
	static int MAX = Integer.MIN_VALUE;
	static int MIN = Integer.MAX_VALUE;
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		/*
		 * N, number[], operator[], MAX, MIN
		 * 
		 * for, switch, if
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		number = new int[N];
		st = new StringTokenizer(br.readLine());

		// number
		for (int i = 0; i < N; i++) {
			number[i] = Integer.valueOf(st.nextToken());
		}

		// operator kind is 4(+ - * /)
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			operator[i] = Integer.valueOf(st.nextToken());
		}

		// start DFS
		DFS(number[0], 1);
		System.out.println(MAX);
		System.out.println(MIN);

	}// end of main

	static void DFS(int num, int index) {
		// end point
		if (index == N) {
			MAX = MAX > num ? MAX : num;
			MIN = MIN < num ? MIN : num;
			return;
		}

		// operator
		for (int i = 0; i < 4; i++) {
			if (operator[i] > 0) {// operator is bigger then 0
				operator[i]--;
				
				switch (i) {
				
				case 0: DFS(num + number[index], index + 1); break;
				case 1: DFS(num - number[index], index + 1); break;
				case 2: DFS(num * number[index], index + 1); break;
				case 3: DFS(num / number[index], index + 1); break;
				}
				operator[i]++;
			}
		}
	}// end of DFS
}// end of class