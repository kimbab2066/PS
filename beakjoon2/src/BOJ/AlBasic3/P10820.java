package BOJ.AlBasic3;

import java.io.*;
import java.util.*;

public class P10820 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = "";
		// EOF
		while ((str = br.readLine()) != null) {

			int arr[] = new int[4];

			for (int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				if (65 <= ch && ch <= 90) {
					arr[1]++;
				} else if (97 <= ch && ch <= 122) {
					arr[0]++;
				} else if (48 <= ch && ch <= 57) {
					arr[2]++;
				} else if (ch == 32) {
					arr[3]++;
				}
			} // end of for
			sb.append(arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3]).append("\n");
		}
		System.out.println(sb);
	}// end of main
}// end of class