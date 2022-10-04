package Programmers.해시.Level1;

import java.util.*;

public class 완주하지_못한_선수 {
	public static void main(String[] args) {

		String participant[] = { "mislav", "stanko", "mislav", "ana" };
		String completion[] = { "stanko", "ana", "mislav" };
		String answer = "";
		/*
		 * 1안 loop participant.length
		 * 
		 * if !participant[i].equals(completion[j])
		 * 
		 * answer = completion[j]
		 */
		/*
		 * 2안 Key-Value
		 * 
		 * 배열 정렬 후 Key-Value를 Part-Comp로 넣는다
		 * 
		 * 남는 Key return
		 */
		Arrays.sort(participant);
		Arrays.sort(completion);
		for (int i = 0; i < participant.length; i++) {
			if (i == completion.length) {
				answer = participant[i];
				break;
			}
			if (!participant[i].equals(completion[i])) {
				answer = participant[i];
				break;
			}
		}
		System.out.println(answer);
		HashMap<String, String> map = new HashMap<>();
		for (int i = 0; i < completion.length; i++) {
			if (participant[i].equals(completion[i])) {
				map.put(participant[i], completion[i]);
			} else {
				answer = participant[i];
				break;
			}
			answer = participant[i + 1];
		}
		System.out.println(answer);

		String result = solution(participant, completion);
		System.out.println("마지막: " + result);
	}// end of main

	static String solution(String[] participant, String[] completion) {
		LinkedList<String> link = new LinkedList<>();

		for (String name : participant)
			link.add(name);

		for (int i = 0; i < completion.length; i++)
			for (int j = 0; j < link.size(); j++)
				if (completion[i].equals(link.get(j))) {
					String result = link.remove(j);
					System.out.println("지우기: " + result);
				}

		System.out.println(link);
		String answer = link.get(0);
		return answer;
	}
}// end of class