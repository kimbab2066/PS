package BOJ.BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2775 {
	static int[][] APT = new int[15][15];

	public static void main(String[] args) throws IOException {
		make_APT();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			int K = Integer.parseInt(br.readLine());
			int N = Integer.parseInt(br.readLine());
			sb.append(APT[K][N]).append("\n");
		}
		System.out.println(sb);
	}// end of main

	static void make_APT() {
		for (int i = 0; i < 15; i++) {
			APT[i][1] = 1;
			APT[0][i] = i;
		}

		for (int i = 1; i < 15; i++) {
			for (int j = 2; j < 15; j++) {
				APT[i][j] = APT[i][j - 1] + APT[i - 1][j];
			}
		}
	}// end of make_APT

}// end of class

//a층의 b호에 살려면, a-1층의 1~b호까지의 사람들의 수의 합
//0층부터 존재,각층 1호부터 시작, 0층의 i호= i명이 산다
//첫줄 test_case
//각 줄의 첫번째 = k,두번째 = n
//1<= k,n <= 14

//예를들어 1 1 3 들어오면
//1층 3호에 살기 위한 조건으로 0층 1,2,3호의 합 만큼 필요하다
//그럼 1+2+3 = 6이 필요