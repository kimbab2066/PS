package baekjoon2.BasicMath1;

import java.util.Scanner;

public class P1712 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int A = in.nextInt();
		int B = in.nextInt();
		int C = in.nextInt();

		if (C <= B) {
			System.out.println(-1);
		} else {
			System.out.println(A / (C - B) + 1);
		}

	}// end of main
}// end of class
// 고정비용 A
// 가변비용 B
// 제품비용 C
//Cn>A + Bn
//C>A/n + B
//Cn-Bn >A
//n(C-B) > A
//n > A/C-B
