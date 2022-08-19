package BOJ.AIMath3;

import java.io.*;
import java.util.*;

public class P11005 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int N = Integer.valueOf(str[0]);
		int B = Integer.valueOf(str[1]);// (2<=B<=36)
		StringBuilder sb = new StringBuilder();

		while (N > 0) {
			if (N % B < 10) {
				sb.append(((char) (N % B + '0')));
			} else {
				sb.append(((char) ((N % B) + 55)));
			}
			N /= B;
		}
		System.out.println(sb.reverse());
	}// end of main
}// end of class