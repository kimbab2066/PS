package beakjoon2.String;

import java.util.Scanner;

public class P5622 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {

			if ('A' <= str.charAt(i) && str.charAt(i) <= 'C') {
				cnt += 3;
			} else if ('D' <= str.charAt(i) && str.charAt(i) <= 'F') {
				cnt += 4;
			} else if ('G' <= str.charAt(i) && str.charAt(i) <= 'I') {
				cnt += 5;
			} else if ('J' <= str.charAt(i) && str.charAt(i) <= 'L') {
				cnt += 6;
			} else if ('M' <= str.charAt(i) && str.charAt(i) <= 'O') {
				cnt += 7;
			} else if ('P' <= str.charAt(i) && str.charAt(i) <= 'S') {
				cnt += 8;
			} else if ('T' <= str.charAt(i) && str.charAt(i) <= 'V') {
				cnt += 9;
			} else if ('W' <= str.charAt(i) && str.charAt(i) <= 'Z') {
				cnt += 10;
			}
		} // end of for
		System.out.println(cnt);
	}// end of main
}// end of class

//다이얼문제
//1~0까지
//입력은 알파벳 대문자로 주어짐
//단어의 길이는 2~15사이
//숫자 1은 2초 걸리고 1보다 크면 1초씩 더 걸림
//필요한 것들
//1,2,3,4,5,6,7,8,9,0
//String Variable
//cnt Variable(시간 측정)
