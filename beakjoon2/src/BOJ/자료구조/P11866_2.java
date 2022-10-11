package BOJ.자료구조;

import java.io.*;
import java.util.*;

public class P11866_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N명이 있으면 K번째를 pop해서 맨 뒤로 보내라는거네. 그냥 listueue써보자
		StringBuilder sb = new StringBuilder();
		LinkedList<Integer> list = new LinkedList<>();
		String[] str = br.readLine().split(" ");
		int N = Integer.valueOf(str[0]);
		int K = Integer.valueOf(str[1]);
		for (int i = 1; i <= N; i++) {
			list.add(i);
		}
		sb.append("<");
		int idx = 0;
		while (list.size() > 1) {
			idx = (idx + (K - 1)) % list.size();
			sb.append(list.remove(idx) + ", ");
		}
		sb.append(list.remove() + ">");
		System.out.println(sb);
		// 7 1 2 4 5

		// <3,6
	}// end of main
}// end of class