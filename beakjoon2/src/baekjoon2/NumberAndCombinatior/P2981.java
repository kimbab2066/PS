package baekjoon2.NumberAndCombinatior;

import java.io.*;
import java.util.*;

public class P2981 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int arr[] = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.valueOf(br.readLine());
		}
		
		Arrays.sort(arr);
		
		//??
		int GCDval = arr[1] - arr[0];
		
		for (int i = 2; i < N; i++) {
			GCDval = GCD(GCDval, arr[i] - arr[i - 1]);
		}
		
		for (int i = 2; i <= GCDval; i++) {
			if(GCDval%i==0) sb.append(i+" ");
		}
		
		System.out.println(sb);
	}// end of main

	static int GCD(int a, int b) {
		if (b == 0) return a;
		while (b != 0) {
			int r = a % b;
			a = b;
			b = r;
		}
		return a;
	}// end of GCD
}// end of class