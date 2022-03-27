package beakjoon2.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3052 {
	static boolean[] arr = new boolean[42];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < 10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		} // end of for
		int cnt = 0;
		for (boolean val : arr) {
			if (val) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}// end of main
}// end of class
