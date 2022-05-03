package baekjoon2.BasicMath1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int up = Integer.parseInt(st.nextToken());
		int down = Integer.parseInt(st.nextToken());
		int length = Integer.parseInt(st.nextToken());

		int day = (length - down) / (up - down);
		if ((length - down) % (up - down) != 0) day++;

		System.out.println(day);
	}// end of main
}// end of class

//높이 V, 낮에 -A, 밤에 +B, 정상 도착 후 -없음
//며칠이 걸리는지 구하시오.
//첫째 줄에 세 정수 A, B, V가 공백으로 구분되어서 주어진다.
//예를 들어 2 1 5면 4일이 걸린다.
//5-2+1=4 1일차
//4-2+1=3 2일차
//3-2+1=2 3일차
//2-2=0   4일차