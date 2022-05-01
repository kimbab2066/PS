package baekjoon2.BasicMath1;

import java.util.Scanner;

public class P2292 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		int cnt = 1;
		int min = 2;

		if (N == 1)
			System.out.println(1);
		else {
			while (min <= N) {
				min = min + (6 * cnt);
				cnt++;
			}
			System.out.println(cnt);
		}

	}// end of main
}// end of class
// N이 주어지고 1~N까지 최소 방 개수 구하기
//N		벌집개수	cnt
//1		1개		1
//2~7	6개		2
//8~19	12개		3
//20~37	18개		4
//38~61	24개		5

//최소 방의 개수 = start + end = 2
