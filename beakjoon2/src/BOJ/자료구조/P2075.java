package BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P2075 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= n; j++) {
				list.add(Integer.valueOf(st.nextToken()));
			}
		}
		Collections.sort(list, Collections.reverseOrder());
		int result = list.get(n - 1);
		System.out.println(result);
	}// end of main
}// end of class