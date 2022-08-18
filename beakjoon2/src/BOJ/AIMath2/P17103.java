package BOJ.AIMath2;

import java.io.*;
import java.util.*;

public class P17103 {
	static boolean[] check = new boolean[1000001];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		check[0] = check[1] = true;
		for (int i = 2; i <= 1000000; i++) {
			if (check[i])
				continue;
			for (int j = i + i; j <= 1000000; j += i) {
				check[j] = true;
			}
		}
		while (N-- > 0) {
			int num = Integer.valueOf(br.readLine());
			int cnt = 0;
			for (int i = 2; i <= num / 2; i++) {
				if (!check[i] && !check[num - i]) cnt++;
			}
			sb.append(cnt).append("\n");
		} // end of while
		System.out.println(sb);
	}// end of main
}// end of class