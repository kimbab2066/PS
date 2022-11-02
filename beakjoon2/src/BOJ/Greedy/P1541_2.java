package BOJ.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1541_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = Integer.MAX_VALUE;
		// -기준으로 구분하기
		String[] subtract = br.readLine().split("-");
		// 구분한 값들을 전부 더해주기
		for (int i = 0; i < subtract.length; i++) {
			int tmp = 0;
			// +의 경우 특수문자라 역슬래시를 붙여줘야함
			String[] add = subtract[i].split("\\+");
			for (int j = 0; j < add.length; j++) {
				tmp += Integer.valueOf(add[j]);
			}
			// sum값이 초기 값이 경우
			if (sum == Integer.MAX_VALUE) {
				sum = tmp;
			} else {// 초기 값이 아니면 전부 빼주기
				sum -= tmp;
			}
		}
		System.out.println(sum);
	}// end of main
}// end of class