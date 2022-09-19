package None;

import java.io.*;
import java.util.*;

public class test2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		int arr[] = new int[N + 1];
		arr[1] = arr[2] = 1;
		int cnt = 0;
		int cnt2 = 0;
		for (int i = 3; i <= N; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
			cnt2++;
		}
		cnt = fib(N);
		System.out.println(arr[N] + " " + cnt2);
	}// end of main

	static int fib(int n) {
		int cnt = 0;
		if (n == 1 || n == 2) {
			return 1;
		} else {
			cnt++;
			return (fib(n - 1) + fib(n - 2));
		}
	}
}// end of class