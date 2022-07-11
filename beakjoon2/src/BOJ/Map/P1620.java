package BOJ.Map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P1620 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.valueOf(st.nextToken());
		int M = Integer.valueOf(st.nextToken());

		HashMap<String, String> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			String pokemon = br.readLine();
			String number = Integer.toString(i + 1);
			map.put(pokemon, number);
			map.put(number, pokemon);
		}

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < M; i++) {
			sb.append(map.get(br.readLine()) + "\n");
		}
		System.out.println(sb);
	}// end of main
}// end of class