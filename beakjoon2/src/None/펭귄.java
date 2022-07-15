package None;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class 펭귄 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int arr[] = new int[3];

		for (int i = 0; i < 3; i++)
			arr[i] = Integer.parseInt(input[i]);

		int min = 0;
		int max = 0;

		if (arr[0] == arr[1] - 1 && arr[1] == arr[2] - 1)
			min = 0;
		else if (arr[0] == arr[1] - 2 || arr[1] == arr[2] - 2)
			min = 1;
		else if (arr[0] == arr[1] - 1 || arr[1] == arr[2] - 1)
			min = 2;
		else
			min = 2;

		max = (arr[1] - arr[0] > arr[2] - arr[1] ? arr[1] - arr[0] : arr[2] - arr[1]) - 1;

		System.out.println(min);
		System.out.println(max);
	}
}
