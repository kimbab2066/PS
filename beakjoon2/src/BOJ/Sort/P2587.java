package BOJ.Sort;

import java.util.*;

class P2587 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		System.out.println(sum / 5 + "\n" + arr[2]);

	}// end of main
}