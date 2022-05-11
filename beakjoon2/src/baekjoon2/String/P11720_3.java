package baekjoon2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11720_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		int sum = 0;

		for (byte val : br.readLine().getBytes()) {
			sum += val - '0';
		}
		System.out.println(sum);
	}// end of main
}
// N ����� �ʿ� ����
// readLine�� ���ڸ� getBytes()�� byte�迭�� ��ȯ�ϴ� for-Each������ ��