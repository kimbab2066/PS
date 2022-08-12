package BOJ.AIMath1;

import java.io.*;
import java.util.*;

public class P2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		int A = Integer.valueOf(str[0]);
		int B = Integer.valueOf(str[1]);

		int R = A * B;
		while (A % B != 0) {
			int r = A % B;
			A = B;
			B = r;
		}

		System.out.println(B);
		System.out.println(R / B);

	}// end of main
}// end of class