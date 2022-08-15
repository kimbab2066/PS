package BOJ.AIMath2;
import java.io.*;
import java.util.*;

public class P1373 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String N = br.readLine();
		StringBuilder sb = new StringBuilder();
    
        //처음 주어진 숫자가 7 or 4 or 1자리인 경우
		if (N.length() % 3 == 1) {
			sb.append(N.charAt(0));
		}
		// 처음 주어진 숫자가 8 or 5 or 2자리인 경우
		if (N.length() % 3 == 2) {
			sb.append((N.charAt(0) - '0') * 2 + (N.charAt(1) - '0'));
		}
		// [2,3,4] [5,6,7]
		// 이유 : += 3
		for (int i = N.length() % 3; i < N.length(); i += 3) {
			sb.append((N.charAt(i) - '0') * 4 + (N.charAt(i + 1) - '0') * 2 + (N.charAt(i + 2) - '0'));
		}
		System.out.println(sb);
	}// end of main
}// end of class