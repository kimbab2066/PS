package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P10845_2 {
	static int first = 0;
	static int rear = 0;
	static int queue[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();
		queue = new int[N];
		while (N-- > 0) {
			String str[] = br.readLine().split(" ");
			switch (str[0]) {
			case "push":
				push(Integer.valueOf(str[1]));
				break;
			case "pop":
				sb.append(pop()).append("\n");
				break;
			case "size":
				sb.append(size()).append("\n");
				break;
			case "empty":
				sb.append(empty()).append("\n");
				break;
			case "front":
				sb.append(front()).append("\n");
				break;
			case "back":
				sb.append(back()).append("\n");
				break;
			}
		} // end of while
		System.out.println(sb);
	}// end of main

	static void push(int X) {
		queue[rear++] = X;
	}

	static int pop() {
		if (size() == 0) {
			return -1;
		}
		return queue[first++];
	}

	static int size() {
		return rear - first;
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
		return queue[rear-1];
	}

}// end of class