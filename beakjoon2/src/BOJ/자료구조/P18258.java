package BOJ.자료구조;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P18258 {
	static int[] array;
	static int first, rear;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.valueOf(br.readLine());
		array = new int[n];
		StringBuilder sb = new StringBuilder();
		while (n-- > 0) {
			String[] str = br.readLine().split(" ");
			String oper = str[0];
			switch (oper) {
			case "push":
				int x = Integer.valueOf(str[1]);
				push(x);
				break;
			case "pop":
				sb.append(pop() + "\n");
				break;
			case "size":
				sb.append(size() + "\n");
				break;
			case "empty":
				sb.append(empty() + "\n");
				break;
			case "front":
				sb.append(front() + "\n");
				break;
			case "back":
				sb.append(back() + "\n");
				break;
			}
		} // end of while
		System.out.println(sb);
	}// end of main

	static void push(int x) {
		array[rear++] = x;
	}

	static int pop() {
		if (size() == 0) {
			return -1;
		}
		return array[first++];
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
		return array[first];
	}

	static int back() {
		if (size() == 0) {
			return -1;
		}
		return array[rear - 1];
	}
}// end of class