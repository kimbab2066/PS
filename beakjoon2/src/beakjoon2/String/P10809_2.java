package beakjoon2.String;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class P10809_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[26];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		String str = br.readLine();
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (arr[ch - 'a'] == -1) {// -1인 경우에만 초기화라는 의미
				arr[ch - 'a'] = i;
			}
		} // end of for
		for (int val : arr) {
			System.out.print(val + " ");
		}

	}// end of main
}// end of class
	// 1.단어S가 주어진다
	// 2.int 배열이 필요할 듯
	// 3.배열의 초기값 -1
	// .for문 돌려서 채크를 해보자
	// .if조건도 넣어야지
