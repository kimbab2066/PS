package BOJ.AIMath2;
import java.io.*;
import java.util.*;

public class P1212 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();// 8진수 N
		StringBuilder sb = new StringBuilder();
		String arr[] = { "000", "001", "010", "011", "100", "101", "110", "111" };

		for (int i = 0; i < N.length(); i++) {
			int num = N.charAt(i) - '0';
			if (i == 0 && num < 4) {//첫 숫자의 경우의 수
				if (num < 2) {//0 or 1
					sb.append(arr[num].substring(2));
				} else {// 2 or 3
					sb.append(arr[num].substring(1));
				}
			} else { // 나머지 숫자의 경우의 수
				sb.append(arr[num]);
			}
		} // end of for
		System.out.println(sb);
	}// end of main
}// end of classss