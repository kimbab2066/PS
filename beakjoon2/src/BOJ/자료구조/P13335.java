package BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class P13335 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int n = Integer.valueOf(str[0]);
		int w = Integer.valueOf(str[1]);
		int l = Integer.valueOf(str[2]);
		Queue<Integer> trucks = new LinkedList<>();
		str = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			trucks.offer(Integer.valueOf(str[i]));
		}
		int time = 0;
		int bridge = 0;
		// 다리에 올릴 Queue
		Queue<Integer> q = new LinkedList<>();
		for (int i = 0; i < w; i++) {
			q.add(0);
		}

		while (!q.isEmpty()) {
			time++;
			bridge -= q.poll();
			if (!trucks.isEmpty()) {
				if (trucks.peek() + bridge <= l) {
					bridge += trucks.peek();
					q.offer(trucks.poll());
				} else {
					q.offer(0);
				}
			}
		}
		System.out.println(time);
	}// end of main
}// end of class