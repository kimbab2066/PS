package BOJ.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class P1152 {
	public static void main(String[] args) throws IOException {
//		Scanner in = new Scanner(System.in);
//		String str = in.nextLine();
//
//		String[] s = str.strip().split(" ");
//
//		System.out.println(s.length);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		System.out.println(st.countTokens());
	}// end of main
}// end of class
