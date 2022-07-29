package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P10828 {
	static int stack[];
	static int size = 0;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();

		stack = new int[N];

		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());

			while (st.hasMoreTokens()) {
				String str = st.nextToken();
				if (str.equals("push")) {
					push(Integer.valueOf(st.nextToken()));
					break;
				} else if (str.equals("pop")) {
					sb.append(pop()).append("\n");
					break;
				} else if (str.equals("size")) {
					sb.append(size()).append("\n");
				} else if (str.equals("empty")) {
					sb.append(empty()).append("\n");
				} else if (str.equals("top")) {
					sb.append(top()).append("\n");
				}
			} // end of while
		} // end of while
		System.out.println(sb);
	}// end of main

	static void push(int item) {
		stack[size] = item;
		size++;
	}

	static int pop() {
		if (size == 0) {
			return -1;
		} else {
			int res = stack[size - 1];
			stack[size - 1] = 0;
			size--;
			return res;
		}
	}

	static int size() {
		return size;
	}

	static int empty() {
		return size == 0 ? 1 : 0;
	}

	static int top() {
		if (size == 0) {
			return -1;
		} else {
			return stack[size - 1];
		}
	}
}// end of class