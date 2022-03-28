package beakjoon2.IandO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		String str = br.readLine();
		for (byte val : str.getBytes()) {
			sum += (val - '0');
		}
		System.out.println(sum);
	}// end of main
}// end of class