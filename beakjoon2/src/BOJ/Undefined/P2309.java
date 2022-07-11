package BOJ.Undefined;

import java.util.Arrays;
import java.util.Scanner;

public class P2309 {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int[] arr = new int[9];
		int sum = 0;
		int cpA = 0;
		int cpB = 0;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.nextInt();
			sum += arr[i];
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (sum - arr[i] - arr[j] == 100) {
					cpA = i;
					cpB = j;
					break;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (i == cpA || i == cpB) continue;
			System.out.println(arr[i]);
		}

	}// end of main
}// end of class

//9���� ������ �� 7���� ���϶�
//�־����� Ű�� �� ���ļ� 100
//������ ������ ���� ������ ��쿡�� �ƹ��ų� ���
//�Է��� 9�ٿ� 9���� Ű ���

//��� ���ϰ� 100�� ���� ���� �������
//���������� 23�̶�� ġ��
//�׷� 23���� ���� ����� ������
//���� ��� 23-11 = 12
//12 - 6 =6
// 6 - 4 = 2
//2 = 