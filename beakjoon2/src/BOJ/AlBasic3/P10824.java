package BOJ.AlBasic3;

import java.io.*;

public class P10824 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str[] = br.readLine().split(" ");
		String AB = str[0] + str[1];
		String CD = str[2] + str[3];
		long result = Long.valueOf(AB) + Long.valueOf(CD);
		System.out.println(result);

	}// end of main
}// end of class