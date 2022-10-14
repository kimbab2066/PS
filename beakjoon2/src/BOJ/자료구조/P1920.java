package BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1920 {
	public static void main(String[] args) throws IOException {
		// N개의 정수가 주어질 때 X라는 정수가 존재하는지 찾기
		// N은 배열, M은 X라는 정수
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.valueOf(st.nextToken());
		}
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();

		int m = Integer.valueOf(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int target = Integer.valueOf(st.nextToken());
			sb.append(binarySearch(0, n - 1, target, arr)).append("\n");
		}
		System.out.println(sb);
	}// end of main

	static int binarySearch(int start, int end, int target, int[] arr) {
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] == target) {
				return 1;
			} else if (arr[mid] <= target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
			mid = (end + start) / 2;
		}
		return 0;
	}// end of bS
}// end of class