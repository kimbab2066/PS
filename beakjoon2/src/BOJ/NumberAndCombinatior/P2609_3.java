package BOJ.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P2609_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int A = Integer.valueOf(str[0]);
		int B = Integer.valueOf(str[1]);
		int gcd = GCD(A, B);
		int lcm = A * B / gcd;
		System.out.println(gcd);
		System.out.println(lcm);
	}

	static int GCD(int a, int b) {
		if (b == 0) return a;
		return GCD(b, a % b);
	}
}
