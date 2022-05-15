package baekjoon2.Undefined;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P15740 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		BigInteger b1 = new BigInteger(st.nextToken());

		System.out.println(b1.add(new BigInteger(st.nextToken())));

	}// end of main
}// end of class