package Programmers.Hash.Level2;

import java.io.*;
import java.util.*;

public class 위장 {
	public static void main(String[] args) throws IOException {
		String clothes[][] = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		String test1[][] = { { "a", "headgear" }, { "b", "headgear" }, { "c", "eyewear" }, { "d", "eyewear" },
				{ "e", "face" }, { "f", "face" } };// 26
		int result = Camouflage.solution(test1);
		System.out.println(result);
	}// end of main
}// end of class

class Camouflage {
	public static int solution(String[][] clothes) {
		int answer = 1;
		/**
		 * 1안 - 조합과 hashMap을 이용해보자.
		 * 
		 * 2안 - Set을 사용하자.대신 이름은 arr.length
		 */
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < clothes.length; i++) {
			map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
		}
		for (String key : map.keySet()) {
			answer *= map.get(key) + 1;
		}
		return answer - 1;
	}// end of main
}// end of class