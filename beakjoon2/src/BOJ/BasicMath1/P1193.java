package BOJ.BasicMath1;

import java.util.Scanner;

public class P1193 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int X = in.nextInt();

		int cnt = 1;// 대각선 칸의 개수
		int sum = 0;// 직전 대각선까지의 누적 합

		while (true) {
			if (X <= sum + cnt) {
				if (cnt % 2 == 1) {
					System.out.print(cnt - (X - sum - 1) + "/" + (X - sum));
					break;
				} else {
					System.out.print((X - sum) + "/" + (cnt - (X - sum - 1)));
					break;
				}
			} else {
				sum += cnt;
				cnt++;

			}

		} // end of while

	}// end of main
}// end of class

//	주어진 X를 이용해 X번째 분수 출력
//	수식화

//	X =14일때(11~15)
//	sum = 1,cnt = 2(2~3)
//	sum = 3,cnt = 3(4~6)
//	sum = 6,cnt = 4(7~10)
//	sum = 10,cnt = 5(11~15)
