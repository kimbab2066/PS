package BOJ.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P11050 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int N = Integer.valueOf(str[0]);
		int K = Integer.valueOf(str[1]);
		System.out.println(recur(N) / recur(N - K) / recur(K));

	}// end of main

	static int recur(int N) {
		if (N == 0) return 1;
		else return N *= recur(N - 1);

	}// end of recur

}// end of class