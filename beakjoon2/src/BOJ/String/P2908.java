package BOJ.String;

import java.util.Scanner;

public class P2908 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String A = in.next();
		String B = in.next();
		// 숫자 뒤집어서 비교
		// 큰수 출력
		String rA = String.valueOf(A.charAt(2)) + String.valueOf(A.charAt(1)) + String.valueOf(A.charAt(0));
		String rB = String.valueOf(B.charAt(2)) + String.valueOf(B.charAt(1)) + String.valueOf(B.charAt(0));
		System.out.println(Integer.parseInt(rA) > Integer.parseInt(rB) ? rA : rB);

	}// end of main
}// end of class
