package BOJ.Sort;

import java.io.*;
import java.util.*;

public class P1427 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int arr[] = new int[str.length()];
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i) - '0';
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					int tmp = arr[j];
					arr[j] = arr[i];
					arr[i] = tmp;
				}
			}
		} // end of for
		StringBuilder sb = new StringBuilder();
		for (int val : arr) {
			sb.append(val);
		}
		System.out.println(sb);

	}
}
