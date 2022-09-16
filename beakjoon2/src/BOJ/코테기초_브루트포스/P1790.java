package BOJ.코테기초_브루트포스;

import java.io.*;
import java.util.*;

public class P1790 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * 앞에서 k번째 자리 숫자가 어떤 숫자인지 구하는 프로그램을 작성하시오.
		 */
		String str[] = br.readLine().split(" ");
		int N = Integer.valueOf(str[0]);
		int K = Integer.valueOf(str[1]);

		long tmpK = K;
		long digit = 1;// 자리수 1,2,3....
		long num = 9;/// 숫자 개수 9,90,900...
		long leter = 0;// 글자의 개수 = digit * num

		while (tmpK > digit * num) {// K가 커지면 범위 내에서 탐색하면 됨
			tmpK -= digit * num;// 자리수 * 숫자의 개수 만큼을 건너 뛰기 위해서 마이너스
			leter += num;//

			digit++;// 이부분 동일
			num *= 10;// 이부분 동일
		}
		leter = (leter + 1) + (tmpK - 1) / digit; // letet + 1이 추가

		if (leter > N) {// 예외 케이스
			System.out.println(-1);
		} else {
			int idx = (int) ((tmpK - 1) % digit);// String으로 변환 후 index 찾을 때 사용 (0부터 시작이라 -1)
			System.out.println(String.valueOf(leter).charAt(idx));
		}
	}// end of main
}// end of class