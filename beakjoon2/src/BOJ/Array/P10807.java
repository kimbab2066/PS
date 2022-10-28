package BOJ.Array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P10807 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int[] arr = new int[201];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			int val = Integer.valueOf(st.nextToken());
			arr[val + 100]++;
		}
		int v = Integer.valueOf(br.readLine());
		System.out.println(arr[v + 100]);
	}// end of main
}// end of class