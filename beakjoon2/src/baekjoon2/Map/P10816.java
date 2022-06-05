package baekjoon2.Map;

import java.io.*;
import java.util.*;

public class P10816 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			int key = Integer.valueOf(st.nextToken());
			map.put(key, map.getOrDefault(key, 0) + 1);
		}
		
		int M = Integer.valueOf(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");

		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < M; i++) {
			int key = Integer.valueOf(st.nextToken());
			sb.append(map.getOrDefault(key, 0) + " ");
		}
		
		System.out.println(sb);
	}// end of main
}// end of class