package BOJ.자료구조;

import java.io.*;
import java.util.*;

public class P2605 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		List<Integer> list = new ArrayList<>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int val = Integer.valueOf(st.nextToken());
			if (i == 0) {
				list.add(i + 1);
			} else {
				list.add(list.size() - val, i + 1);
			}
		}
		for (int val : list) {
			System.out.print(val + " ");
		}
	}// end of main
}// end of class