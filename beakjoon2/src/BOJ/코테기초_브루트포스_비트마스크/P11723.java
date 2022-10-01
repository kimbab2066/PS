package BOJ.코테기초_브루트포스_비트마스크;

import java.io.*;
import java.util.*;

public class P11723 {

	public static void main(String[] args) throws IOException {
		/*
		 * 비어있는 공집합 S가 주어졌을 때, 아래 연산을 수행하는 프로그램을 작성하시오.
		 * 
		 * 첫째 줄에 수행해야 하는 연산의 수 M (1 ≤ M ≤ 3,000,000)이 주어진다.
		 * 
		 * 둘째 줄부터 M개의 줄에 수행해야 하는 연산이 한 줄에 하나씩 주어진다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int M = Integer.valueOf(br.readLine());

		int bitset = 0;
		while (M-- > 0) {
			String[] str = br.readLine().split(" ");
			String oper = str[0];
			int num;
			switch (oper) {
			case "all":
				bitset = (1 << 21) - 1;
				break;
			case "empty":
				bitset = 0;
				break;
			case "add":
				num = Integer.valueOf(str[1]);
				bitset |= (1 << (num - 1));
				break;
			case "remove":
				num = Integer.valueOf(str[1]);
				bitset = bitset & ~(1 << (num - 1));
				break;
			case "check":
				num = Integer.valueOf(str[1]);
				sb.append((bitset & (1 << (num - 1))) != 0 ? "1\n" : "0\n");
				break;
			case "toggle":
				num = Integer.valueOf(str[1]);
				bitset ^= (1 << (num - 1));
				break;
			}
		} // end of while
		System.out.println(sb);
	}// end of main
}// end of class