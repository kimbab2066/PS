package BOJ.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P2609_2 {
	public static void main(String[] args) throws IOException {
		// GCD is Greatest Common Divisor
		// LCM is Least Common Multiple
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int A = Integer.valueOf(str[0]);
		int B = Integer.valueOf(str[1]);

		System.out.println(GCD(A, B));
		System.out.println(LCM(A, B));

	}// end of main

	static int GCD(int a, int b) {
		if (b == 0) return a;
		return GCD(b, a % b);
	}

	static int LCM(int a, int b) {
		return a * b / GCD(b, a % b);
	}
}// end of class