package baekjoon2.String;

import java.util.Scanner;

public class P10809_3 {
	static int[] arr = new int[26];

	public static void main(String[] args) {
		// input
		Scanner in = new Scanner(System.in);

		String S = in.nextLine();

		// initial value = -1
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		// index check and assign value
		for (int i = 0; i < S.length(); i++) {
			if (arr[S.charAt(i) - 'a'] == -1) {
				arr[S.charAt(i) - 'a'] = i;
			}
		}

		// output
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}// end of main
}// end of class

//baekjoon
//b = 0
//a = 1
//e = 2
//k = 4
//j = 3
//o = 7
//n = 5
//�ߺ�x