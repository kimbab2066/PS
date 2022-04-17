package beakjoon2.Function;

public class P4673_3 {
	public static void main(String[] args) {
		boolean[] check = new boolean[10001];
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i < 10001; i++) {
			int N = d(i);
			if (N < 10001)
				check[N] = true;
			if (!check[i])
				sb.append(i).append("\n");
		}
		System.out.println(sb);
	}// end of main

	static int d(int n) {
		int sum = n;
		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		return sum;
	}
}// end of class
