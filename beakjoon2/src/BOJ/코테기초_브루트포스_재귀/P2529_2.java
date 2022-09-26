package BOJ.코테기초_브루트포스_재귀;

import java.io.*;
import java.util.*;

public class P2529_2 {
	static int K;
	static boolean[] visited = new boolean[10];
	static char sign[];
	static List<String> list = new ArrayList<>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		K = Integer.valueOf(br.readLine());
		sign = new char[K];
		String str[] = br.readLine().split(" ");
		for (int i = 0; i < K; i++)
			sign[i] = str[i].charAt(0);
		bfs("", 0);
		System.out.println(list.get(list.size() - 1));
		System.out.println(list.get(0));

	}// end of main

	static void bfs(String num, int depth) {
		if (depth == K + 1) {
			list.add(num);
			return;
		}
		for (int i = 0; i < 10; i++) {
			if (depth == 0 || !visited[i] && compare(num.charAt(num.length() - 1) - '0', i, sign[depth - 1])) {
				visited[i] = true;
				bfs(num + i, depth + 1);
				visited[i] = false;
			}
		}
	}// end of bfs

	static boolean compare(int a, int b, char c) {
		if (c == '<')
			return a < b;
		return a > b;
	}
}// end of class