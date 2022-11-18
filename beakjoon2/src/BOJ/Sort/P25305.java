package BOJ.Sort;

import java.util.Arrays;
import java.util.Scanner;

public class P25305 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int K = in.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
		Arrays.sort(arr);
		int len = arr.length;
		for (int i = len - 1; K > 0; i--) {
			int val = arr[i];
			K--;
			if (K == 0) {
				System.out.println(val);
				break;
			}
		}

	}
}
