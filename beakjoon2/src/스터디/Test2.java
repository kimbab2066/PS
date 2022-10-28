package 스터디;

import java.util.Scanner;

public class Test2 {
	static String str, str2;

	public static void main(String[] args) {
		input();
		logic();
		output();
	}// end of main

	static void input() {
		Scanner in = new Scanner(System.in);
		str = in.nextLine();
		str2 = in.nextLine();
	}// end of input

	static void logic() {
		for (int i = 0; i < str2.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				char ch = str2.charAt(i);
				if (str.indexOf(ch) != -1) {
					int idx = str.indexOf(ch);
					if (str.indexOf(ch) == 0) {
						idx = str.indexOf(ch, str.indexOf(ch) + 1);
					}
					str = str.substring(0, idx) + str.substring(idx + 1, str.length());
					break;
				}
			}
		}
	}// end of logic

	static void output() {
		System.out.println(str);
	}// end of output
}// end of class