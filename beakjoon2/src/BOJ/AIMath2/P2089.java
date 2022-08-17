package BOJ.AIMath2;

import java.io.*;
import java.util.*;

public class P2089 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long N = Long.valueOf(br.readLine());// -20억<= N <= 20억
		StringBuilder sb = new StringBuilder();
		if (N == 0)
			System.out.println(0);
		while (N != 0) {
			long r = N % -2;
			N /= -2;
			if (r == -1) {// = (r<0)
				r *= -1;
				N++;
			}
			sb.append(r);
		}

		System.out.println(sb.reverse());

	}// end of main
}// end of class