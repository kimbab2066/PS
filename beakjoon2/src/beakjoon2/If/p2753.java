package beakjoon2.If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//2753번
public class p2753 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int y = Integer.parseInt(br.readLine());
		// 윤년 = 1 아니면 = 0
		// 윤년 : 4의 배수/!100의배수 or 400의 배수
		System.out.println((y % 4 == 0) ? (((y % 400 == 0) ? "1" : (y % 100 == 0) ? "0" : "1")) : "0");
	}// end of main
}// end of class
