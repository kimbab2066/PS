package beakjoon2.For;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		StringBuilder sb = new StringBuilder();

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			int val = Integer.parseInt(st.nextToken());
			if (val < X) sb.append(val).append(" ");
		} // end of for
		System.out.println(sb);
	}// end of main
}// end of class
