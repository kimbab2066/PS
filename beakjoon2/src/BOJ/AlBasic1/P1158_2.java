package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P1158_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int N = Integer.valueOf(str[0]);
		int K = Integer.valueOf(str[1]);
		
		Queue<Integer> queue = new LinkedList<>();
		
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= N; i++) {
			queue.offer(i);
		}
		sb.append("<");
		while (queue.size() != 1) {
			for (int i = 1; i < K; i++) {
				queue.offer(queue.poll());
			}
			sb.append(queue.poll() + ", ");
		}
		sb.append(queue.poll() + ">");
		System.out.println(sb);
	}// end of main
}// end of class