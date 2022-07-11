package BOJ.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P2609 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();

		System.out.println(GCD(a, b));
		System.out.println(LCM(a, b));

	}// end of main

	// GCD(a,b) -> GCD(b,a%b)
	// Greatest Common Divisor
	public static int GCD(int a, int b) {
		if (b == 0) return a;
		return GCD(b, a % b);
	}// end of GCD

	// Least Common Multiple
	// A * B / d = abcd /d(최대 공약수)
	public static int LCM(int a, int b) {
		return a * b / GCD(a, b);
	}// end of LCM
}// end of class