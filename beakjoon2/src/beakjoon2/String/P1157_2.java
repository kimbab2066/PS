package beakjoon2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1157_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] arr = new int[26];

		for (int i = 0; i < str.length(); i++) {
			// 대소문자 구분 x = a 와 A가 동일한 idx값을 가져도 된다는 의미
			if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				arr[str.charAt(i) - 'a']++;
			} else {
				// ex) A = 65(ascii code) 65 - 65 = 0
				// arr[0]++와 같은 의미
				arr[str.charAt(i) - 'A']++;
			}
		}
		// max and output(ch)
		int max = -1;
		char ch = '?';

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);// int -> casting
			} else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
//대소문자 구분 x
//입력 String
//여러개일경우 ?
//출력 대문자
