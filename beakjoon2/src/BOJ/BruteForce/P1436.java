package BOJ.BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1436 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		/*
		 * N<=10,000 output = 666,1666,2666,3666... N번째 영화 제목에 들어간 숫자 구하기
		 * 
		 */
		int N = Integer.parseInt(br.readLine());
		int result = 666;

		
		result += (N - 1) * 1000;
		
		
		
		System.out.println(result);

	}// end of main
}// end of class
