package BOJ.BruteForce;

import java.util.Scanner;

public class P2798 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = in.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}

		int result = search(arr, N, M);

		System.out.println(result);
	}// end of main

	static int search(int[] arr, int N, int M) {
		int result = 0;

		for (int i = 0; i < N - 2; i++) {
			for (int j = i + 1; j < N - 1; j++) {
				for (int k = j + 1; k < N; k++) {
					int tmp = arr[i] + arr[j] + arr[k];
					if (M == tmp) {
						return tmp;
					}
					if (result < tmp && tmp < M) {
						result = tmp;
					}
				}
			}
		} // end of for
		return result;
	}// end of search

}// end of class
//3번 돌리면 되지 않을까?
//입력 N M 주어짐
//둘째줄 N개의 숫자
//M에 가까운 카드 3장의 합