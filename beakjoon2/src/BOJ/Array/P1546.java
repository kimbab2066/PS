package BOJ.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1546 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int max = -1;
		double sum = 0.0;
		for (int i = 0; i < N; i++) {
			int val = Integer.parseInt(st.nextToken());
			if (val > max)
				max = val;
			sum += val;
		} // end of for
		System.out.println((sum / max * 100) / N);

	}// end of main
}// end of class
