package beakjoon2.Function;

public class P4673 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10001; i++) {
			int n = d(i);
			if (n < 10001)
				check[n] = true;
			if (!check[i])
				sb.append(i).append("\n");
		}
		System.out.println(sb);
	}// end of main

	static int d(int number) {
		int sum = number;
		while (number != 0) {
			sum = sum + number % 10;
			number = number / 10;
		}
		return sum;
	}
}
