package BOJ.코테기초_브루트포스;

import java.io.*;
import java.util.*;

public class P1476 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 지구를 나타내는 수를 E, 태양을 나타내는 수를 S, 달을 나타내는 수를 M
		 * 
		 * (1 ≤ E ≤ 15, 1 ≤ S ≤ 28, 1 ≤ M ≤ 19)
		 * 
		 * 첫째 줄에 세 수 E, S, M이 주어진다. 문제에 나와있는 범위를 지키는 입력만 주어진다.
		 * 
		 * 첫째 줄에 E S M으로 표시되는 가장 빠른 연도를 출력한다. 1 1 1은 항상 1이기 때문에, 정답이 음수가 나오는 경우는 없다.
		 */
		/*
		 * 1 2 3일 때 5266이 나오는 방법
		 *
		 * 1 16 16 = 16
		 * 
		 * 2 17 17 = 17
		 * 
		 * 3 18 18 = 18
		 * 
		 * 4 19 19 = 19
		 * 
		 * 5 20 1 = 20
		 * 
		 * 6 21 2 = 21
		 * 
		 * 7 22 3 = 22
		 * 
		 * 1안 3중 Loop를 돌리면 되지 않을까?
		 */
		String str[] = br.readLine().split(" ");
		int E = Integer.valueOf(str[0]);
		int S = Integer.valueOf(str[1]);
		int M = Integer.valueOf(str[2]);

		int e = 0;
		int s = 0;
		int m = 0;
		int y = 0;

		int year = 0;
		while (true) {
			year++;
			if ((year - E) % 15 == 0 && (year - S) % 28 == 0 && (year - M) % 19 == 0) break;
		}
		System.out.println(year);
		while (true) {
			y++;
			e++;
			s++;
			m++;
			if (e > 15)
				e = 1;
			if (s > 28)
				s = 1;
			if (m > 19)
				m = 1;
			if (E == e && S == s && M == m)
				break;
		}
		System.out.println(y);
	}// end of main
}// end of class