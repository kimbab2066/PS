package beakjoon2.Function;

import java.io.IOException;
import java.util.Scanner;

public class P1065_2 {
	public static void main(String[] args) throws IOException {
		// 버퍼를 써도 되지만 코드 길이가 길어지니 패스
		Scanner in = new Scanner(System.in);
		System.out.println(arithmetic_sequence(in.nextInt()));
	}// end of main

	static int arithmetic_sequence(int N) {
		// 입력값이 100보다 작은 경우
		if (N < 100)
			return N;
		// 입력값이 100보다 큰 경우
		else {
			// cnt는 그냥 카운트 변수(100이상일 때 카운트 사용)
			int cnt = 99;
			if (N == 1000) N = 999;// 1000은 등차수열이 아니기에 바꿈
			// else조건 자체가 100이상을 의미하기에 i의 초기화 식도 100부터 시작
			for (int i = 100; i <= N; i++) {
				int h = i / 100;
				int t = (i / 10) % 10;
				int s = i % 10;
				// 100의자리-10의자리 == 10의자리-1의자리
				if ((h - t) == (t - s)) {
					cnt++;
				}
			}
			return cnt;
		}
	}// end of arithmetic_sequence
}// end of class

//일단 100을 기준으로
//100보다 작으면 입력받은 N 그대로 출력
//100보다 크면 알고리즘 짜야됨

//if number = 123
// h = 1
// t = 2
// s = 3