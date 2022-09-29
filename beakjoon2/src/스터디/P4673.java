package 스터디;

import java.io.*;
import java.util.*;

public class P4673 {
	public static void main(String[] args) throws IOException {
		boolean check[] = new boolean[10001];
		StringBuilder sb = new StringBuilder();

		for (int i = 1; i <= 10000; i++) {
			int d = self_number(i);
			if (d < 10001) check[d] = true;

			if (!check[i]) sb.append(i).append("\n");
		}
		System.out.println(sb);

	}// end of main

	static int self_number(int i) {
		int result = i;
		while (i > 0) {
			result += i % 10;
			i /= 10;
		}
		return result;
	}// end of self_number
}// end of class