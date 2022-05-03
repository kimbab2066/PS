package baekjoon2.BasicMath1;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int X = in.nextInt();

		// 대각선
		int cross = 1;
		int sum = 0;

		while (true) {
			if (X <= cross + sum) {
				if (cross % 2 == 1) {
					System.out.print((cross - (X - sum - 1)) + "/" + (X - sum));
					break;
				} else {
					System.out.print((X - sum) + "/" + (cross - (X - sum - 1)));
					break;
				}

			} else {
				sum += cross;
				cross++;
			}
		} // end of while
	}// end of main
}// end of class
