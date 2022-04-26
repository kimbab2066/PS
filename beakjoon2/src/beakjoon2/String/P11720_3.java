package beakjoon2.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P11720_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		br.readLine();
		int sum = 0;

		for (byte val : br.readLine().getBytes()) {
			sum += val - '0';
		}
		System.out.println(sum);
	}// end of main
}
// N 사용할 필요 없음
// readLine한 문자를 getBytes()로 byte배열로 반환하니 for-Each돌리면 끝