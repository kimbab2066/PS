package BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P15828 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		Queue<Integer> q = new LinkedList<>();
		while (true) {
			int num = Integer.valueOf(br.readLine());
			if (num == -1) break;
			if (num == 0) q.poll();
			else if (q.size() < N) q.offer(num);
		}
		if (q.isEmpty()) {
			System.out.println("empty");
		} else {
			for (int val : q) {
				System.out.print(val + " ");
			}
		}
	}// end of main
}// end of class