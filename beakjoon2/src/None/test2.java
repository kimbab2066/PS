package None;

import java.io.*;
import java.util.*;

public class test2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int arr[] = new int[N + 1];
		int cnt = 0;
		arr[1] = arr[2] = 1;

		for (int i = 3; i <= N; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			cnt++;
		}
		System.out.println(fib(N) + " " + cnt);
	}// end of main

	static int fib(int n) {
		if (n == 1 || n == 2) return 1;
		return (fib(n - 1) + fib(n - 2));
	}
}// end of class