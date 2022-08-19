package BOJ.AIMath3;

import java.io.*;
import java.util.*;

public class P11005_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int N = Integer.valueOf(str[0]);
		int B = Integer.valueOf(str[1]);// (2<=B<=36)
		List<Character> list = new ArrayList<>();
		StringBuilder sb = new StringBuilder();

		while (N > 0) {
			if (N % B < 10) {
				list.add((char) (N % B + '0'));
			} else {
				list.add((char) ((N % B) + 55));
			}
			N /= B;
		}
		for (int i = list.size() - 1; i >= 0; i--) {
			sb.append(list.get(i));
		}
		System.out.println(sb);
	}// end of main
}// end of class