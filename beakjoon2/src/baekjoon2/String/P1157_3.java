package baekjoon2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1157_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] arr = new int[26];

		for (int i = 0; i < str.length(); i++) {
			if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				arr[str.charAt(i) - 'a']++;
			} else {
				arr[str.charAt(i) - 'A']++;
			}
		} // end of for

		int max = 0;
		char ch = '?';

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if (max == arr[i]) {
				ch = '?';
			}
		} // end of for
		System.out.println(ch);

	}// end of main
}// end of class

// be given String
// Upper,LowerCase is not divide
// Many exist = ?
// Output is UpperCase
