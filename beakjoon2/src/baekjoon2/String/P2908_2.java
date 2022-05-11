package baekjoon2.String;

import java.util.Scanner;

public class P2908_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int A = in.nextInt();
		int B = in.nextInt();

		in.close();

		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
		System.out.println(A > B ? A : B);

	}
}
