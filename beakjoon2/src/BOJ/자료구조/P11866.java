package BOJ.자료구조;

import java.io.*;
import java.util.*;

public class P11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// N명이 있으면 K번째를 pop해서 맨 뒤로 보내라는거네. 그냥 Queue써보자
		StringBuilder sb = new StringBuilder();
		Queue<Integer> q = new LinkedList<>();
		String[] str = br.readLine().split(" ");
		int N = Integer.valueOf(str[0]);
		int K = Integer.valueOf(str[1]);
		for (int i = 1; i <= N; i++) {
			q.offer(i);
		}
		sb.append("<");
		while (q.size() != 1) {
			for (int i = 1; i < K; i++) {
				q.offer(q.poll());
			}
			sb.append(q.poll() + ", ");
		}
		sb.append(q.poll() + ">");
		System.out.println(sb);
		// 7 1 2 4 5 
		
		// <3,6
	}// end of main
}// end of class