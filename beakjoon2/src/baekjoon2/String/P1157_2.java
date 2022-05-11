package baekjoon2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1157_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] arr = new int[26];

		for (int i = 0; i < str.length(); i++) {
			// ��ҹ��� ���� x = a �� A�� ������ idx���� ������ �ȴٴ� �ǹ�
			if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				arr[str.charAt(i) - 'a']++;
			} else {
				// ex) A = 65(ascii code) 65 - 65 = 0
				// arr[0]++�� ���� �ǹ�
				arr[str.charAt(i) - 'A']++;
			}
		}
		// max and output(ch)
		int max = -1;
		char ch = '?';

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);// int -> casting
			} else if (arr[i] == max) {
				ch = '?';
			}
		}
		System.out.println(ch);
	}
}
//��ҹ��� ���� x
//�Է� String
//�������ϰ�� ?
//��� �빮��
