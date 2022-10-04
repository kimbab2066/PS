package Programmers.해시.Level1;

import java.io.*;
import java.util.*;

public class 완주하지_못한_선수_2 {
	public static void main(String[] args) throws IOException {
		String participant[] = { "mislav", "stanko", "mislav", "ana" };
		String completion[] = { "stanko", "ana", "mislav" };

		String answer = "";
		HashMap<String, Integer> map = new HashMap<>();
		for (String player : participant) {
			map.put(player, map.getOrDefault(player, 0) + 1);
		}
		System.out.println(map);
		for (String player : completion) {
			map.put(player, map.get(player) - 1);
		}
		System.out.println(map);

		for (String key : map.keySet()) {
			if (map.get(key) != 0) {
				answer = key;
			}
		}
		System.out.println(answer);
	}// end of main
}
// end of class