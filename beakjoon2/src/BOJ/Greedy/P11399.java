package BOJ.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class P11399 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int i = 0; i < N; i++) {
			int prior = Integer.valueOf(st.nextToken());
			pq.offer(prior);
		}
		int total = 0, sum = 0;

		while (!pq.isEmpty()) {
			sum += pq.poll();
			total += sum;
		}
		System.out.println(total);
	}// end of main
}// end of class
//31432
//3
//4
//8
//11
//13
//15 
//39