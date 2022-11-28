package BOJ.Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1629 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		long a = Integer.valueOf(str[0]);
		long b = Integer.valueOf(str[1]);
		long c = Integer.valueOf(str[2]);
		System.out.println(recur(a, b, c));
	}// main

	static long recur(long a, long b, long c) {
		if (b == 1) return a % c;
		long tmp = recur(a, b / 2, c);
		tmp = tmp * tmp % c;
		if (b % 2 == 1) return tmp * a % c;
		return tmp;
	}// recur
}// class