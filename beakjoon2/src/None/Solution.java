package None;

import java.util.*;
import java.io.*;

class Solution {
	static int Answer;
	static int arr[];
	static StringTokenizer st;

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.valueOf(br.readLine());
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int test_case = 0; test_case < T; test_case++) {
			int N = Integer.valueOf(br.readLine());// 1번째줄 N
			st = new StringTokenizer(br.readLine(), " ");// 2번째줄 N마리
			arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = Integer.valueOf(st.nextToken());
			}
			st = new StringTokenizer(br.readLine()); // 3번째줄 N마리 value
			for (int i = 0; i < N; i++) {
				map.put(arr[i], Integer.valueOf(st.nextToken()));
			}
			Answer = selection_sort(arr, arr[0]);

			System.out.println("Case #" + (test_case + 1));
			System.out.println(Answer);
			Answer = 0;
		} // end of test_case
	}// end of main

	static int selection_sort(int arr[], int size) {
		int val = 0;
		for (int i = 0; i < size; i++) {
			int minidx = i;
			for (int j = i + 1; j < size; j++) {
				if (arr[minidx] > arr[j]) {
					minidx = j;
				}
			}
			int temp = arr[minidx];
			arr[minidx] = arr[i];
			arr[i] = temp;
			val += arr[i];
		}
		return val;
	}// end of selection_sort
}// end of class