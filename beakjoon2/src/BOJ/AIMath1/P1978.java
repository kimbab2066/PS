package BOJ.AIMath1;

import java.io.*;
import java.util.*;

public class P1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int cnt = 0;

		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			boolean check = true;
			int num = Integer.valueOf(st.nextToken());
			if (num == 1)
				continue;
			for (int i = 2; i <= Math.sqrt(num); i++) {
				if (num % i == 0) {
					check = false;
					break;
				}
			}
			if (check)
				cnt++;
		}
		System.out.println(cnt);
	}// end of main
}
