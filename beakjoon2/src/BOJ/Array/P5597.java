package BOJ.Array;

import java.util.*;

public class P5597 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[31];
		for (int i = 1; i <= 28; i++) {
			arr[in.nextInt()]++;
		}
		for (int i = 1; i <= 30; i++) {
			if(arr[i]==0) System.out.println(i);
		}
		
	}// end of main
}