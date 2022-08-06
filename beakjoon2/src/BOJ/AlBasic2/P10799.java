package BOJ.AlBasic2;

import java.io.*;
import java.util.*;

public class P10799 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> stack = new Stack<>();// 일단 스택으로 접근해보자
		String str = br.readLine();

		int result = 0; // 결과값을 담을 변수
		for (int i = 0; i < str.length(); i++) {// 문자열 갯수만큼 반복
			char ch = str.charAt(i);
			if (ch == '(') {
				stack.push(ch);
				continue;
			} else if (ch == ')') {
				stack.pop();
				if (str.charAt(i - 1) == '(') {
					result += stack.size();
				} else {
					result++;
				}
			}
		} // end of for

		System.out.println(result);
	}// end of main
} // end of class
