package 스터디;

import java.io.*;

public class StringTest {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int[26];
		String str = br.readLine();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		for (int i = 0; i < str.length(); i++) {
			if (arr[str.charAt(i) - 97] == -1) {
				arr[str.charAt(i) - 97] = i;
			}
		}
		for (int val : arr) {
			System.out.print(val + " ");
		}
	}// end of main
}// end of class