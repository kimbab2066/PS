package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P10866 {
	static int deque[] = new int[10000];
	static int first = 0;// --
	static int rear = 0;// ++
	static int size = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();

		while (N-- > 0) {
			String str[] = br.readLine().split(" ");
			switch (str[0]) {
			case ("push_front"):
				push_front(Integer.valueOf(str[1]));
				break;
			case ("push_back"):
				push_back(Integer.valueOf(str[1]));
				break;
			case ("pop_front"):
				sb.append(pop_front()).append("\n");
				break;
			case ("pop_back"):
				sb.append(pop_back()).append("\n");
				break;
			case ("size"):
				sb.append(size()).append("\n");
				break;
			case ("empty"):
				sb.append(empty()).append("\n");
				break;
			case ("front"):
				sb.append(front()).append("\n");
				break;
			case ("back"):
				sb.append(back()).append("\n");
				break;
			}// end of switch
		} // end of while
		System.out.println(sb);
	}// end of main

	static void push_front(int X) {
		deque[first] = X;
		first = (first - 1 + deque.length) % deque.length;
		size++;
	}

	static void push_back(int X) {
		rear = (rear + 1) % deque.length;
		size++;
		deque[rear] = X;
	}

	static int pop_front() {
		if (size() == 0) {
			return -1;
		}
		size--;
		first = (first + 1) % deque.length;
		return deque[first];
	}

	static int pop_back() {
		if (size() == 0) {
			return -1;
		}
		int result = deque[rear];
		rear = (rear - 1 + deque.length) % deque.length;
		size--;
		return result;
	}

	static int size() {
		return size;
	}

	static int empty() {
		return size() == 0 ? 1 : 0;
	}

	static int front() {
		if (size() == 0) {
			return -1;
		}
		return deque[(first + 1) % deque.length];
	}

	static int back() {
		if (size() == 0) {
			return -1;
		}
		return deque[rear];
	}

}// end of class