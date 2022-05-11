package baekjoon2.Function;

public class P15596 {
	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60 };
		System.out.println(sum(a));

	}// end of main

	static long sum(int[] a) {
		long ans = 0;
		for (int i = 0; i < a.length; i++) {
			ans += a[i];
		}
		return ans;
	}
}// end of class
