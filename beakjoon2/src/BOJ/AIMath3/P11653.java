package BOJ.AIMath3;

import java.io.*;
import java.util.*;

public class P11653 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();

		for (int i = 2; i * i < N; i++) {// i*i == sqrt(N)
			while (N % i == 0) {
				sb.append(i + "\n");
				N /= i;
			}
		}
		if (N != 1) {
			sb.append(N);
		}
		System.out.println(sb);
	}// end of main
}// end of class