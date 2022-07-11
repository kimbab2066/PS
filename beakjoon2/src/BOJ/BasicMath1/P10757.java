package BOJ.BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class P10757 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] arr = br.readLine().split(" ");
		BigInteger b1 = new BigInteger(arr[0]);
		BigInteger b2 = new BigInteger(arr[1]);

		System.out.println(b1.add(b2));

	}// end of main
}// end of class
