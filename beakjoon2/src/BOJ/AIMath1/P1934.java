package BOJ.AIMath1;

import java.io.*;
import java.util.*;

public class P1934 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();

		while (T-- > 0) {
			String str[] = br.readLine().split(" ");
			int A = Integer.valueOf(str[0]);
			int B = Integer.valueOf(str[1]);
			int R = A * B;
			while (A % B != 0) {
				int r = A % B;
				A = B;
				B = r;
			}
			sb.append(R / B).append("\n");
		}
		System.out.println(sb);
	}// end of main
}// end of class