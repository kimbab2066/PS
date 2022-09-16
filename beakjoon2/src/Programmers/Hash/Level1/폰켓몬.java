package Programmers.Hash.Level1;

import java.util.HashMap;
import java.util.Iterator;

public class 폰켓몬 {
	public static void main(String[] args) {
		int nums[] = { 3, 1, 2, 3 };
		int answer = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int pocket : nums) {
			map.put(pocket, 1);
		}
		answer = map.size() > nums.length / 2 ? nums.length / 2 : map.size();
		System.out.println(answer);
	}// end of main
}// end of class