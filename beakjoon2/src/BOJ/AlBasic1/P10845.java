package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P10845 {
	static int queue[];
	static int first = 0;
	static int last = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		queue = new int[N];
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;

		while (N-- > 0) {
			st = new StringTokenizer(br.readLine());
			String oper = st.nextToken();
			if (oper.equals("push")) {
				push(Integer.valueOf(st.nextToken()));
			} else if (oper.equals("pop")) {
				sb.append(pop()).append("\n");
			} else if (oper.equals("size")) {
				sb.append(size()).append("\n");
			} else if (oper.equals("empty")) {
				sb.append(empty()).append("\n");
			} else if (oper.equals("front")) {
				sb.append(front()).append("\n");
			} else if (oper.equals("back")) {
				sb.append(back()).append("\n");
			}
		} // end of while
		System.out.println(sb);
	}// end of main

	static void push(int N) {
		queue[last++] = N;
	}

	static int pop() {
		if (size() == 0) {
			return -1;
		}
		return queue[first++];
	}

	static int size() {
		return last - first;
	}

	static int empty() {
		return size() == 0 ? 1 : 0;
	}

	static int front() {
		if (size() == 0) {
			return -1;
		}
		return queue[first];
	}

	static int back() {
		if (size() == 0) {
			return -1;
		}
		return queue[last - 1];
	}
}// end of class