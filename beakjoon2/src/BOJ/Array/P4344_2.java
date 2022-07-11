package BOJ.Array;

import java.util.Scanner;

public class P4344_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int C = in.nextInt();
		int arr[];
		// C = Test_case
		for (int i = 0; i < C; i++) {

			// N = number of people
			int N = in.nextInt();

			arr = new int[N];

			double sum = 0;

			// input score
			for (int j = 0; j < N; j++) {
				int val = in.nextInt();
				arr[j] = val;
				// total score
				sum += val;
			}
			// average
			double mean = sum / N;
			// count
			double cnt = 0;
			// better than mean
			for (int j = 0; j < N; j++) {
				if (arr[j] > mean) cnt++;
			}
			// output
			System.out.printf("%.3f%%\n", cnt / N * 100);
		}
	}// end of main
}
