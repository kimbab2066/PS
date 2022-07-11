package BOJ.If;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P14681 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(br.readLine());
		int y = Integer.parseInt(br.readLine());
		// 사분면 번호 출력
		if (x > 0) {
			if (y > 0) System.out.println(1);
			else System.out.println(4);
		} else {
			if (y > 0) System.out.println(2);
			else System.out.println(3);
		}
		// 삼항연산자
		System.out.println((x > 0) ? ((y > 0) ? 1 : 4) : ((y < 0) ? 3 : 2));
	}// end of main
}// end of class