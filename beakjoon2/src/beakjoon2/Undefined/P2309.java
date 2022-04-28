package beakjoon2.Undefined;

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

//9명의 난쟁이 중 7명을 구하라
//주어지는 키는 다 합쳐서 100
//가능한 정답이 여러 가지인 경우에는 아무거나 출력
//입력은 9줄에 9명의 키 출력

//모두 더하고 100을 빼준 값을 사용하자
//나머지값이 23이라고 치자
//그럼 23보다 작은 값들로 빼보자
//예를 들어 23-11 = 12
//12 - 6 =6
// 6 - 4 = 2
//2 = 