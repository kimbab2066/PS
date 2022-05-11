package baekjoon2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1157 {
	public static void main(String[] args) throws IOException {
		// input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int[] arr = new int[26];

		for (int i = 0; i < str.length(); i++) {
			if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
				arr[str.charAt(i) - 'a']++;
			} else {
				arr[str.charAt(i) - 'A']++;
			}

		}
		int max = -1;
		char ch = '?';
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				ch = (char) (i + 65);
			} else if (arr[i] == max) {
				ch = '?';
			}
		}

		// output
		System.out.println(ch);
	}
}
// String���� 1���� char ������ ��
// ��ҹ��� ���� x
// �ش� idx�� ++
// �������� idx ������ �������̸� �� �������� ���� ��� ?

//ex
//z�� ������ z-a