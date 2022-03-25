package beakjoon2.If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//9498
public class P9498 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int score = Integer.parseInt(br.readLine());

		System.out.println((score >= 90) ? "A" : (score >= 80) ? "B" : (score >= 70) ? "C" : (score >= 60) ? "D" : "F");
	}// end of main
}// end of class
