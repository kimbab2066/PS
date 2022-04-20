package beakjoon2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1157 {
	public static void main(String[] args) throws IOException {
		// input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int[] arr = new int[26];

		for (int i = 0; i < str.length(); i++) {
			if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				arr[str.charAt(i) - 'a']++;
			} else {
				arr[str.charAt(i) - 'A']++;
			}

		}
		int max = -1;
		char ch = '?';
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if (arr[i] == max) {
				ch = '?';
			}
		}

		// output
		System.out.println(ch);
	}
}
// String에서 1개씩 char 단위로 비교
// 대소문자 구분 x
// 해당 idx에 ++
// 예외조건 idx 개수가 여러개이며 그 개수들이 같을 경우 ?

//ex
//z가 들어오면 z-a