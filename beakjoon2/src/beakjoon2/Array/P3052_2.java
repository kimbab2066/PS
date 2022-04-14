package beakjoon2.Array;

import java.util.HashSet;
import java.util.Scanner;

public class P3052_2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[42];

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int i = 0; i < 10; i++) {// 반복횟수는 10번으로 고정~
			// 처음 값을 넣을 때 42로 나눈 나머지 값을 넣자~
			hs.add(in.nextInt() % 42);
		}
		System.out.println(hs.size());

	}// end of main
}// end of class
