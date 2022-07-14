package BOJ.BackTracking;

import java.io.*;
import java.util.*;

public class P14888 {
	static int N;
	static int number[];
	static int operator[] = new int[4];
	static int MAX = Integer.MIN_VALUE;
	static int MIN = Integer.MAX_VALUE;
	static StringTokenizer st;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.valueOf(br.readLine());
		number = new int[N];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			number[i] = Integer.valueOf(st.nextToken());
		}

		// 4종류라 4번만
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < 4; i++) {
			operator[i] = Integer.valueOf(st.nextToken());
		}

		// 첫번째 숫자,index
		DFS(number[0], 1);
		System.out.println(MAX);
		System.out.println(MIN);
	}// end of main

	static void DFS(int num, int idx) {
		if (N == idx) {
			MAX = MAX > num ? MAX : num;
			MIN = MIN < num ? MIN : num;
			return;
		}
		
		// 연산자 종류만큼 반복
		for (int i = 0; i < 4; i++) {
			if (operator[i] > 0) {
				operator[i]--;
				switch (i) {
				case 0: DFS(num + number[idx], idx + 1); break;
				case 1: DFS(num - number[idx], idx + 1); break;
				case 2: DFS(num * number[idx], idx + 1); break;
				case 3: DFS(num / number[idx], idx + 1); break;
				}//end of switch
				operator[i]++;//operator restore
			}
		}

	}// end of DFS
}// end of class