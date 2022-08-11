package BOJ.AlBasic3;

import java.io.*;
import java.util.*;

public class P10809_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		int index[] = new int[26];

		for (int i = 0; i < index.length; i++) {
			index[i] = -1;
		}

		for (int i = 0; i < S.length(); i++) {
			if (index[S.charAt(i) - 97] == -1) {
				index[S.charAt(i) - 97] = i;
			}
		}
		for (int val : index) {
			System.out.print(val + " ");
		}
	}// end of main
}// end of class