package Programmers.해시.Level2;

import java.io.*;
import java.util.*;

public class 전화번호_목록 {
	public static void main(String[] args) throws IOException {
		String[] phone_book = { "123", "456", "789" };
		boolean val = Solution.solution(phone_book);
		System.out.println(val);
	}
}// end of class

class Solution {
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		Arrays.sort(phone_book);

		for (int i = 0; i < phone_book.length - 1; i++) {
			if (phone_book[i + 1].startsWith(phone_book[i])) {
				answer = false;
				break;
			}
		}
		return answer;
	}// end of solution
}// end of class