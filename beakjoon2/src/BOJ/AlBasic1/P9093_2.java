package BOJ.AlBasic1;

import java.io.*;
import java.util.*;

public class P9093_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.valueOf(br.readLine());
		StringBuilder sb = new StringBuilder();

		Stack stack = new Stack<>();
		while (N-- > 0) {
			String s = br.readLine();
			for (int i = 0; i < s.length(); i++) {// 문자열의 길이만큼 반복
				if (s.charAt(i) == ' ') {// 공백인 경우
					while (!stack.empty()) {// stack에 있는 char를 전부 pop
						sb.append(stack.pop());
					}
					sb.append(" ");// 비어있는 경우 공백 append
				} else {// 공백이 아닌 경우
					stack.push(s.charAt(i));// stack.push( char 문자열 반복)
				}
			}
			while (!stack.empty()) {// stack이 비어있지 않은 경우
				sb.append(stack.pop());// pop으로 위에서부터 꺼낸다
			}
			sb.append("\n");// while loop 끝나기 전에 줄바꿈
		} // end of while
		System.out.println(sb);
	}// end of main

}// end of class