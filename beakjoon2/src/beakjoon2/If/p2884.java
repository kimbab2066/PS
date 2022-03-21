package beakjoon2.If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class p2884 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		if (M < 45) {
			M = 60 - (45 - M);
			H--;
			if (H < 0)
				H = 23;
			System.out.println(H + " " + M);
		} else {
			System.out.println(H + " " + (M - 45));
		}
		System.out.println((M < 45) ? m45(H, M) : H + " " + (M - 45));

	}// end of main

	static String m45(int H, int M) {
		M = 60 - (45 - M);
		H--;
		if (H < 0)
			H = 23;
		return H + " " + M;
	}
}
// end of class
