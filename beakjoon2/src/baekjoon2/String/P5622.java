package baekjoon2.String;

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

//���̾���
//1~0����
//�Է��� ���ĺ� �빮�ڷ� �־���
//�ܾ��� ���̴� 2~15����
//���� 1�� 2�� �ɸ��� 1���� ũ�� 1�ʾ� �� �ɸ�
//�ʿ��� �͵�
//1,2,3,4,5,6,7,8,9,0
//String Variable
//cnt Variable(�ð� ����)
