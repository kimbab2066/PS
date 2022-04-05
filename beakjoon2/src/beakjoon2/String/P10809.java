package beakjoon2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int[] arr = new int[26];

		// -1로 초기화
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}

		String S = br.readLine();

		for (int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
			if (arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}// end of main
}// end of class
//a-z 담을 배열 
//ascii 97-122 a-z
//not include = return -1
//[0] = a
//[1] = b