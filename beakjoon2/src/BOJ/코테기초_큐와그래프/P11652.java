package BOJ.코테기초_큐와그래프;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P11652 {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		Map<Long, Integer> map = new HashMap<>();
		long max = 0, result = 0;
		while (n-- > 0) {
			long num = in.nextLong();
			map.put(num, map.getOrDefault(num, 0) + 1);

			if (map.get(num) > max) {
				max = map.get(num);
				result = num;
			} else if (map.get(num) == max) {
				result = Math.min(result, num);
			}
		}
		System.out.println(result);
	}// end of main
}// end of class