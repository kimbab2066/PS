package beakjoon2.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P2577 {
	static int arr[] = new int[10];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		int val = (A * B * C);
		String str = String.valueOf(val);// toString의 경우 Object가 null인 경우 NPE(NullPointerException)을 발생
		for (int i = 0; i < str.length(); i++) {
			arr[(str.charAt(i) - '0')]++;
		} // end of for
		for (int v : arr) {
			System.out.println(v);
		}
	}// end of main
}// end of class
