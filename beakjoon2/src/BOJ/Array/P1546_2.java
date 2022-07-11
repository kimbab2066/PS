package BOJ.Array;

import java.util.Scanner;

public class P1546_2 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int N = in.nextInt();
		int M = -1;// 초기값 -1

		double[] arr = new double[N];

		for (int i = 0; i < arr.length; i++) {
			int val = in.nextInt();
			arr[i] = val;
			if (val > M) {
				M = val;
			} // end of if
		} // end of for

		// 점수조작
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] / M * 100;
		}
		// 합계
		double sum = 0.0;
		for (double val : arr) {
			sum += val;
		}
		System.out.println(sum / N);

	}// end of main
}
