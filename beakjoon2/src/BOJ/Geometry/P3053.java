package BOJ.Geometry;

import java.io.*;
import java.util.*;

public class P3053 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int R = Integer.valueOf(br.readLine());
		double pi = Math.PI;
		System.out.printf("%.4f", pi * R * R);
		System.out.println();
		System.out.println(2 * R * R);

	}// end of main
}// end of class
//참고 : https://ahdelron.tistory.com/41