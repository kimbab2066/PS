package beakjoon2.Function;

public class P4673 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];// 1~10000

		for (int i = 1; i < 10001; i++) {
			int n = d(i);
			if (n < 10001) {
				check[n] = true;
			}
		} // end of for
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < 10001; i++) {
			if (!check[i]) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}// end of main

	public static int d(int number) {
		int sum = number;
		while (number != 0) {
			sum = sum + number % 10;
			number = number / 10;
		} // end of while
		return sum;

	}
}// end of class
