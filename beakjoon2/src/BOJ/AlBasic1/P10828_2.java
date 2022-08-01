package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P10828_2 {
	static int stack[];
	static int size = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		stack = new int[N];
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
			} else if (oper.equals("top")) {
				sb.append(top()).append("\n");
			}
		}
		System.out.println(sb);
	}// end of main

	static void push(int X) {
		stack[size] = X;
		size++;
	}

	static int pop() {
		if (size == 0) {
			return -1;
		} else {
			int result = stack[size - 1];
			size--;
			return result;
		}
	}

	static int size() {
		return size;
	}

	static int empty() {
		return size == 0 ? 1 : 0;
	}

	static int top() {
		return size == 0 ? -1 : stack[size - 1];
	}
}// end of class
