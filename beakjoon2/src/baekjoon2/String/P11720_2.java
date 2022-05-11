package baekjoon2.String;

import java.util.Scanner;

public class P11720_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int sum = 0;
		String str = in.next();
		for (int i = 0; i < N; i++) {
			sum += str.charAt(i) - '0';
		}
		System.out.println(sum);
	}
}
//next vs nextLine()
//next() is using the tokens
//nextLine() is read a \n
